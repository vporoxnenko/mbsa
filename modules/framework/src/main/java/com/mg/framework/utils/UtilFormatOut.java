package com.mg.framework.utils;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/**
 * General output formatting functions - mainly for helping in JSPs
 */
public class UtilFormatOut {

  public static final String module = UtilFormatOut.class.getName();
  // ------------------- price format handlers -------------------
  static DecimalFormat priceDecimalFormat = new DecimalFormat("#,##0.00");
  // ------------------- percentage format handlers -------------------
  static DecimalFormat percentageDecimalFormat = new DecimalFormat("##0.##%");
  // ------------------- quantity format handlers -------------------
  static DecimalFormat quantityDecimalFormat = new DecimalFormat("#,##0.###");

  public static String safeToString(Object obj) {
    if (obj != null) {
      return obj.toString();
    } else {
      return "";
    }
  }

  /**
   * Formats a Double representing a price into a string
   *
   * @param price The price Double to be formatted
   * @return A String with the formatted price
   */
  public static String formatPrice(Double price) {
    if (price == null) return "";
    return formatPrice(price.doubleValue());
  }

  /**
   * Formats a double representing a price into a string
   *
   * @param price The price double to be formatted
   * @return A String with the formatted price
   */
  public static String formatPrice(double price) {
    return priceDecimalFormat.format(price);
  }

  /**
   * Formats a double into a properly formatted currency string based on isoCode and Locale
   *
   * @param price   The price double to be formatted
   * @param isoCode the currency ISO code
   * @param locale  The Locale used to format the number
   * @return A String with the formatted price
   */
  public static String formatCurrency(double price, String isoCode, Locale locale) {
    //Debug.logInfo("formatting currency: " + price + ", isoCode: " + isoCode + ", locale: " + locale, module);
    NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
    if (isoCode != null && isoCode.length() > 1) {
      nf.setCurrency(Currency.getInstance(isoCode));
    } else {
      //Debug.logWarning("No isoCode specified to format currency value:" + price, module);
    }
    return nf.format(price);
  }

  /**
   * Formats a double into a properly formatted currency string based on isoCode and Locale
   *
   * @param price   The price Double to be formatted
   * @param isoCode the currency ISO code
   * @param locale  The Locale used to format the number
   * @return A String with the formatted price
   */
  public static String formatCurrency(Double price, String isoCode, Locale locale) {
    return formatCurrency(price.doubleValue(), isoCode, locale);
  }

  /**
   * Formats a Double representing a percentage into a string
   *
   * @param percentage The percentage Double to be formatted
   * @return A String with the formatted percentage
   */
  public static String formatPercentage(Double percentage) {
    if (percentage == null) return "";
    return formatPercentage(percentage.doubleValue());
  }

  /**
   * Formats a double representing a percentage into a string
   *
   * @param percentage The percentage double to be formatted
   * @return A String with the formatted percentage
   */
  public static String formatPercentage(double percentage) {
    return percentageDecimalFormat.format(percentage);
  }

  /**
   * Formats an Long representing a quantity into a string
   *
   * @param quantity The quantity Long to be formatted
   * @return A String with the formatted quantity
   */
  public static String formatQuantity(Long quantity) {
    if (quantity == null)
      return "";
    else
      return formatQuantity(quantity.doubleValue());
  }

  /**
   * Formats an int representing a quantity into a string
   *
   * @param quantity The quantity long to be formatted
   * @return A String with the formatted quantity
   */
  public static String formatQuantity(long quantity) {
    return formatQuantity((double) quantity);
  }

  /**
   * Formats an Integer representing a quantity into a string
   *
   * @param quantity The quantity Integer to be formatted
   * @return A String with the formatted quantity
   */
  public static String formatQuantity(Integer quantity) {
    if (quantity == null)
      return "";
    else
      return formatQuantity(quantity.doubleValue());
  }

  /**
   * Formats an int representing a quantity into a string
   *
   * @param quantity The quantity int to be formatted
   * @return A String with the formatted quantity
   */
  public static String formatQuantity(int quantity) {
    return formatQuantity((double) quantity);
  }

  /**
   * Formats a Float representing a quantity into a string
   *
   * @param quantity The quantity Float to be formatted
   * @return A String with the formatted quantity
   */
  public static String formatQuantity(Float quantity) {
    if (quantity == null)
      return "";
    else
      return formatQuantity(quantity.doubleValue());
  }

  /**
   * Formats a float representing a quantity into a string
   *
   * @param quantity The quantity float to be formatted
   * @return A String with the formatted quantity
   */
  public static String formatQuantity(float quantity) {
    return formatQuantity((double) quantity);
  }

  /**
   * Formats an Double representing a quantity into a string
   *
   * @param quantity The quantity Double to be formatted
   * @return A String with the formatted quantity
   */
  public static String formatQuantity(Double quantity) {
    if (quantity == null)
      return "";
    else
      return formatQuantity(quantity.doubleValue());
  }

  /**
   * Formats an double representing a quantity into a string
   *
   * @param quantity The quantity double to be formatted
   * @return A String with the formatted quantity
   */
  public static String formatQuantity(double quantity) {
    return quantityDecimalFormat.format(quantity);
  }

  public static String formatPaddedNumber(long number, int numericPadding) {
    StringBuffer outStrBfr = new StringBuffer(Long.toString(number));
    while (numericPadding > outStrBfr.length()) {
      outStrBfr.insert(0, '0');
    }
    return outStrBfr.toString();
  }

  public static String formatPaddingRemove(String original) {
    if (original == null) return null;
    StringBuffer orgBuf = new StringBuffer(original);
    while (orgBuf.length() > 0 && orgBuf.charAt(0) == '0') {
      orgBuf.deleteCharAt(0);
    }
    return orgBuf.toString();
  }


  // ------------------- date handlers -------------------

  /**
   * Formats a String timestamp into a nice string
   *
   * @param timestamp String timestamp to be formatted
   * @return A String with the formatted date/time
   */
  public static String formatDate(java.sql.Timestamp timestamp) {
    if (timestamp == null)
      return "";
    DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.FULL);
    java.util.Date date = (java.util.Date) timestamp;
    return df.format(date);
  }

  // ------------------- null string handlers -------------------

  /**
   * Checks to see if the passed Object is null, if it is returns an empty but non-null string,
   * otherwise calls toString() on the object
   *
   * @param obj1 The passed Object
   * @return The toString() of the passed Object if not null, otherwise an empty non-null String
   */
  public static String makeString(Object obj1) {
    if (obj1 != null)
      return obj1.toString();
    else
      return "";
  }

  /**
   * Checks to see if the passed string is null, if it is returns an empty but non-null string.
   *
   * @param string1 The passed String
   * @return The passed String if not null, otherwise an empty non-null String
   */
  public static String checkNull(String string1) {
    if (string1 != null)
      return string1;
    else
      return "";
  }

  /**
   * Returns the first passed String if not null, otherwise the second if not null, otherwise an
   * empty but non-null String.
   *
   * @param string1 The first passed String
   * @param string2 The second passed String
   * @return The first passed String if not null, otherwise the second if not null, otherwise an
   * empty but non-null String
   */
  public static String checkNull(String string1, String string2) {
    if (string1 != null)
      return string1;
    else if (string2 != null)
      return string2;
    else
      return "";
  }

  /**
   * Returns the first passed String if not null, otherwise the second if not null, otherwise the
   * third if not null, otherwise an empty but non-null String.
   *
   * @param string1 The first passed String
   * @param string2 The second passed String
   * @param string3 The third passed String
   * @return The first passed String if not null, otherwise the second if not null, otherwise the
   * third if not null, otherwise an empty but non-null String
   */
  public static String checkNull(String string1, String string2, String string3) {
    if (string1 != null)
      return string1;
    else if (string2 != null)
      return string2;
    else if (string3 != null)
      return string3;
    else
      return "";
  }

  /**
   * Returns the first passed String if not null, otherwise the second if not null, otherwise the
   * third if not null, otherwise the fourth if not null, otherwise an empty but non-null String.
   *
   * @param string1 The first passed String
   * @param string2 The second passed String
   * @param string3 The third passed String
   * @param string4 The fourth passed String
   * @return The first passed String if not null, otherwise the second if not null, otherwise the
   * third if not null, otherwise the fourth if not null, otherwise an empty but non-null String
   */
  public static String checkNull(String string1, String string2, String string3, String string4) {
    if (string1 != null)
      return string1;
    else if (string2 != null)
      return string2;
    else if (string3 != null)
      return string3;
    else if (string4 != null)
      return string4;
    else
      return "";
  }

  /**
   * Returns <code>pre + base + post</code> if base String is not null or empty, otherwise an empty
   * but non-null String.
   *
   * @param base The base String
   * @param pre  The pre String
   * @param post The post String
   * @return <code>pre + base + post</code> if base String is not null or empty, otherwise an empty
   * but non-null String.
   */
  public static String ifNotEmpty(String base, String pre, String post) {
    if (base != null && base.length() > 0)
      return pre + base + post;
    else
      return "";
  }

  /**
   * Returns the first passed String if not empty, otherwise the second if not empty, otherwise an
   * empty but non-null String.
   *
   * @param string1 The first passed String
   * @param string2 The second passed String
   * @return The first passed String if not empty, otherwise the second if not empty, otherwise an
   * empty but non-null String
   */
  public static String checkEmpty(String string1, String string2) {
    if (string1 != null && string1.length() > 0)
      return string1;
    else if (string2 != null && string2.length() > 0)
      return string2;
    else
      return "";
  }

  /**
   * Returns the first passed String if not empty, otherwise the second if not empty, otherwise the
   * third if not empty, otherwise an empty but non-null String.
   *
   * @param string1 The first passed String
   * @param string2 The second passed String
   * @param string3 The third passed String
   * @return The first passed String if not empty, otherwise the second if not empty, otherwise the
   * third if not empty, otherwise an empty but non-null String
   */
  public static String checkEmpty(String string1, String string2, String string3) {
    if (string1 != null && string1.length() > 0)
      return string1;
    else if (string2 != null && string2.length() > 0)
      return string2;
    else if (string3 != null && string3.length() > 0)
      return string3;
    else
      return "";
  }

  // ------------------- web encode handlers -------------------

  /**
   * Encodes an HTTP URL query String, replacing characters used for other things in HTTP URL query
   * strings, but not touching the separator characters '?', '=', and '&'
   *
   * @param query The plain query String
   * @return The encoded String
   */
  public static String encodeQuery(String query) {
    String retString;

    retString = replaceString(query, "%", "%25");
    retString = replaceString(retString, " ", "%20");
    return retString;
  }

  /**
   * Encodes a single HTTP URL query value, replacing characters used for other things in HTTP URL
   * query strings
   *
   * @param query The plain query value String
   * @return The encoded String
   */
  public static String encodeQueryValue(String query) {
    String retString;

    retString = replaceString(query, "%", "%25");
    retString = replaceString(retString, " ", "%20");
    retString = replaceString(retString, "&", "%26");
    retString = replaceString(retString, "?", "%3F");
    retString = replaceString(retString, "=", "%3D");
    return retString;
  }

  /**
   * Replaces all occurances of oldString in mainString with newString
   *
   * @param mainString The original string
   * @param oldString  The string to replace
   * @param newString  The string to insert in place of the old
   * @return mainString with all occurances of oldString replaced by newString
   */
  public static String replaceString(String mainString, String oldString, String newString) {
    return StringUtils.replaceString(mainString, oldString, newString);
  }

  /**
   * Decodes a single query value from an HTTP URL parameter, replacing %ASCII values with
   * characters
   *
   * @param query The encoded query value String
   * @return The plain, decoded String
   */
  public static String decodeQueryValue(String query) {
    String retString;

    retString = replaceString(query, "%25", "%");
    retString = replaceString(retString, "%20", " ");
    retString = replaceString(retString, "%26", "&");
    retString = replaceString(retString, "%3F", "?");
    retString = replaceString(retString, "%3D", "=");
    return retString;
  }

  // ------------------- web encode handlers -------------------

  /**
   * Encodes an XML string replacing the characters '<', '>', '"', ''', '&'
   *
   * @param inString The plain value String
   * @return The encoded String
   */
  public static String encodeXmlValue(String inString) {
    String retString = inString;

    retString = StringUtils.replaceString(retString, "&", "&amp;");
    retString = StringUtils.replaceString(retString, "<", "&lt;");
    retString = StringUtils.replaceString(retString, ">", "&gt;");
    retString = StringUtils.replaceString(retString, "\"", "&quot;");
    retString = StringUtils.replaceString(retString, "'", "&apos;");
    return retString;
  }

  public static String decodeXmlValue(String inString) {
    String retString = inString;

    retString = StringUtils.replaceString(retString, "&amp;", "&");
    retString = StringUtils.replaceString(retString, "&quot;", "\"");
    retString = StringUtils.replaceString(retString, "&apos;", "'");
    retString = StringUtils.replaceString(retString, "&lt;", "<");
    retString = StringUtils.replaceString(retString, "&gt;", ">");
    return retString;
  }
}
