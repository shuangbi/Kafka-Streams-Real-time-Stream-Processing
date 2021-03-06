/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package guru.learningjournal.kafka.examples;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class StockData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6525888803353821088L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"StockData\",\"namespace\":\"guru.learningjournal.kafka.examples\",\"fields\":[{\"name\":\"symbol\",\"type\":[\"null\",\"string\"]},{\"name\":\"series\",\"type\":[\"null\",\"string\"]},{\"name\":\"open\",\"type\":[\"null\",\"float\"]},{\"name\":\"high\",\"type\":[\"null\",\"float\"]},{\"name\":\"low\",\"type\":[\"null\",\"float\"]},{\"name\":\"close\",\"type\":[\"null\",\"float\"]},{\"name\":\"last\",\"type\":[\"null\",\"float\"]},{\"name\":\"previousClose\",\"type\":[\"null\",\"float\"]},{\"name\":\"totalTradedQty\",\"type\":[\"null\",\"long\"]},{\"name\":\"totalTradedVal\",\"type\":[\"null\",\"double\"]},{\"name\":\"tradeDate\",\"type\":[\"null\",\"string\"]},{\"name\":\"totalTrades\",\"type\":[\"null\",\"int\"]},{\"name\":\"isinCode\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence symbol;
  @Deprecated public java.lang.CharSequence series;
  @Deprecated public java.lang.Float open;
  @Deprecated public java.lang.Float high;
  @Deprecated public java.lang.Float low;
  @Deprecated public java.lang.Float close;
  @Deprecated public java.lang.Float last;
  @Deprecated public java.lang.Float previousClose;
  @Deprecated public java.lang.Long totalTradedQty;
  @Deprecated public java.lang.Double totalTradedVal;
  @Deprecated public java.lang.CharSequence tradeDate;
  @Deprecated public java.lang.Integer totalTrades;
  @Deprecated public java.lang.CharSequence isinCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public StockData() {}

  /**
   * All-args constructor.
   * @param symbol The new value for symbol
   * @param series The new value for series
   * @param open The new value for open
   * @param high The new value for high
   * @param low The new value for low
   * @param close The new value for close
   * @param last The new value for last
   * @param previousClose The new value for previousClose
   * @param totalTradedQty The new value for totalTradedQty
   * @param totalTradedVal The new value for totalTradedVal
   * @param tradeDate The new value for tradeDate
   * @param totalTrades The new value for totalTrades
   * @param isinCode The new value for isinCode
   */
  public StockData(java.lang.CharSequence symbol, java.lang.CharSequence series, java.lang.Float open, java.lang.Float high, java.lang.Float low, java.lang.Float close, java.lang.Float last, java.lang.Float previousClose, java.lang.Long totalTradedQty, java.lang.Double totalTradedVal, java.lang.CharSequence tradeDate, java.lang.Integer totalTrades, java.lang.CharSequence isinCode) {
    this.symbol = symbol;
    this.series = series;
    this.open = open;
    this.high = high;
    this.low = low;
    this.close = close;
    this.last = last;
    this.previousClose = previousClose;
    this.totalTradedQty = totalTradedQty;
    this.totalTradedVal = totalTradedVal;
    this.tradeDate = tradeDate;
    this.totalTrades = totalTrades;
    this.isinCode = isinCode;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return symbol;
    case 1: return series;
    case 2: return open;
    case 3: return high;
    case 4: return low;
    case 5: return close;
    case 6: return last;
    case 7: return previousClose;
    case 8: return totalTradedQty;
    case 9: return totalTradedVal;
    case 10: return tradeDate;
    case 11: return totalTrades;
    case 12: return isinCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: symbol = (java.lang.CharSequence)value$; break;
    case 1: series = (java.lang.CharSequence)value$; break;
    case 2: open = (java.lang.Float)value$; break;
    case 3: high = (java.lang.Float)value$; break;
    case 4: low = (java.lang.Float)value$; break;
    case 5: close = (java.lang.Float)value$; break;
    case 6: last = (java.lang.Float)value$; break;
    case 7: previousClose = (java.lang.Float)value$; break;
    case 8: totalTradedQty = (java.lang.Long)value$; break;
    case 9: totalTradedVal = (java.lang.Double)value$; break;
    case 10: tradeDate = (java.lang.CharSequence)value$; break;
    case 11: totalTrades = (java.lang.Integer)value$; break;
    case 12: isinCode = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'symbol' field.
   * @return The value of the 'symbol' field.
   */
  public java.lang.CharSequence getSymbol() {
    return symbol;
  }

  /**
   * Sets the value of the 'symbol' field.
   * @param value the value to set.
   */
  public void setSymbol(java.lang.CharSequence value) {
    this.symbol = value;
  }

  /**
   * Gets the value of the 'series' field.
   * @return The value of the 'series' field.
   */
  public java.lang.CharSequence getSeries() {
    return series;
  }

  /**
   * Sets the value of the 'series' field.
   * @param value the value to set.
   */
  public void setSeries(java.lang.CharSequence value) {
    this.series = value;
  }

  /**
   * Gets the value of the 'open' field.
   * @return The value of the 'open' field.
   */
  public java.lang.Float getOpen() {
    return open;
  }

  /**
   * Sets the value of the 'open' field.
   * @param value the value to set.
   */
  public void setOpen(java.lang.Float value) {
    this.open = value;
  }

  /**
   * Gets the value of the 'high' field.
   * @return The value of the 'high' field.
   */
  public java.lang.Float getHigh() {
    return high;
  }

  /**
   * Sets the value of the 'high' field.
   * @param value the value to set.
   */
  public void setHigh(java.lang.Float value) {
    this.high = value;
  }

  /**
   * Gets the value of the 'low' field.
   * @return The value of the 'low' field.
   */
  public java.lang.Float getLow() {
    return low;
  }

  /**
   * Sets the value of the 'low' field.
   * @param value the value to set.
   */
  public void setLow(java.lang.Float value) {
    this.low = value;
  }

  /**
   * Gets the value of the 'close' field.
   * @return The value of the 'close' field.
   */
  public java.lang.Float getClose() {
    return close;
  }

  /**
   * Sets the value of the 'close' field.
   * @param value the value to set.
   */
  public void setClose(java.lang.Float value) {
    this.close = value;
  }

  /**
   * Gets the value of the 'last' field.
   * @return The value of the 'last' field.
   */
  public java.lang.Float getLast() {
    return last;
  }

  /**
   * Sets the value of the 'last' field.
   * @param value the value to set.
   */
  public void setLast(java.lang.Float value) {
    this.last = value;
  }

  /**
   * Gets the value of the 'previousClose' field.
   * @return The value of the 'previousClose' field.
   */
  public java.lang.Float getPreviousClose() {
    return previousClose;
  }

  /**
   * Sets the value of the 'previousClose' field.
   * @param value the value to set.
   */
  public void setPreviousClose(java.lang.Float value) {
    this.previousClose = value;
  }

  /**
   * Gets the value of the 'totalTradedQty' field.
   * @return The value of the 'totalTradedQty' field.
   */
  public java.lang.Long getTotalTradedQty() {
    return totalTradedQty;
  }

  /**
   * Sets the value of the 'totalTradedQty' field.
   * @param value the value to set.
   */
  public void setTotalTradedQty(java.lang.Long value) {
    this.totalTradedQty = value;
  }

  /**
   * Gets the value of the 'totalTradedVal' field.
   * @return The value of the 'totalTradedVal' field.
   */
  public java.lang.Double getTotalTradedVal() {
    return totalTradedVal;
  }

  /**
   * Sets the value of the 'totalTradedVal' field.
   * @param value the value to set.
   */
  public void setTotalTradedVal(java.lang.Double value) {
    this.totalTradedVal = value;
  }

  /**
   * Gets the value of the 'tradeDate' field.
   * @return The value of the 'tradeDate' field.
   */
  public java.lang.CharSequence getTradeDate() {
    return tradeDate;
  }

  /**
   * Sets the value of the 'tradeDate' field.
   * @param value the value to set.
   */
  public void setTradeDate(java.lang.CharSequence value) {
    this.tradeDate = value;
  }

  /**
   * Gets the value of the 'totalTrades' field.
   * @return The value of the 'totalTrades' field.
   */
  public java.lang.Integer getTotalTrades() {
    return totalTrades;
  }

  /**
   * Sets the value of the 'totalTrades' field.
   * @param value the value to set.
   */
  public void setTotalTrades(java.lang.Integer value) {
    this.totalTrades = value;
  }

  /**
   * Gets the value of the 'isinCode' field.
   * @return The value of the 'isinCode' field.
   */
  public java.lang.CharSequence getIsinCode() {
    return isinCode;
  }

  /**
   * Sets the value of the 'isinCode' field.
   * @param value the value to set.
   */
  public void setIsinCode(java.lang.CharSequence value) {
    this.isinCode = value;
  }

  /**
   * Creates a new StockData RecordBuilder.
   * @return A new StockData RecordBuilder
   */
  public static guru.learningjournal.kafka.examples.StockData.Builder newBuilder() {
    return new guru.learningjournal.kafka.examples.StockData.Builder();
  }

  /**
   * Creates a new StockData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new StockData RecordBuilder
   */
  public static guru.learningjournal.kafka.examples.StockData.Builder newBuilder(guru.learningjournal.kafka.examples.StockData.Builder other) {
    return new guru.learningjournal.kafka.examples.StockData.Builder(other);
  }

  /**
   * Creates a new StockData RecordBuilder by copying an existing StockData instance.
   * @param other The existing instance to copy.
   * @return A new StockData RecordBuilder
   */
  public static guru.learningjournal.kafka.examples.StockData.Builder newBuilder(guru.learningjournal.kafka.examples.StockData other) {
    return new guru.learningjournal.kafka.examples.StockData.Builder(other);
  }

  /**
   * RecordBuilder for StockData instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<StockData>
    implements org.apache.avro.data.RecordBuilder<StockData> {

    private java.lang.CharSequence symbol;
    private java.lang.CharSequence series;
    private java.lang.Float open;
    private java.lang.Float high;
    private java.lang.Float low;
    private java.lang.Float close;
    private java.lang.Float last;
    private java.lang.Float previousClose;
    private java.lang.Long totalTradedQty;
    private java.lang.Double totalTradedVal;
    private java.lang.CharSequence tradeDate;
    private java.lang.Integer totalTrades;
    private java.lang.CharSequence isinCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(guru.learningjournal.kafka.examples.StockData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.symbol)) {
        this.symbol = data().deepCopy(fields()[0].schema(), other.symbol);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.series)) {
        this.series = data().deepCopy(fields()[1].schema(), other.series);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.open)) {
        this.open = data().deepCopy(fields()[2].schema(), other.open);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.high)) {
        this.high = data().deepCopy(fields()[3].schema(), other.high);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.low)) {
        this.low = data().deepCopy(fields()[4].schema(), other.low);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.close)) {
        this.close = data().deepCopy(fields()[5].schema(), other.close);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.last)) {
        this.last = data().deepCopy(fields()[6].schema(), other.last);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.previousClose)) {
        this.previousClose = data().deepCopy(fields()[7].schema(), other.previousClose);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.totalTradedQty)) {
        this.totalTradedQty = data().deepCopy(fields()[8].schema(), other.totalTradedQty);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.totalTradedVal)) {
        this.totalTradedVal = data().deepCopy(fields()[9].schema(), other.totalTradedVal);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.tradeDate)) {
        this.tradeDate = data().deepCopy(fields()[10].schema(), other.tradeDate);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.totalTrades)) {
        this.totalTrades = data().deepCopy(fields()[11].schema(), other.totalTrades);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.isinCode)) {
        this.isinCode = data().deepCopy(fields()[12].schema(), other.isinCode);
        fieldSetFlags()[12] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing StockData instance
     * @param other The existing instance to copy.
     */
    private Builder(guru.learningjournal.kafka.examples.StockData other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.symbol)) {
        this.symbol = data().deepCopy(fields()[0].schema(), other.symbol);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.series)) {
        this.series = data().deepCopy(fields()[1].schema(), other.series);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.open)) {
        this.open = data().deepCopy(fields()[2].schema(), other.open);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.high)) {
        this.high = data().deepCopy(fields()[3].schema(), other.high);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.low)) {
        this.low = data().deepCopy(fields()[4].schema(), other.low);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.close)) {
        this.close = data().deepCopy(fields()[5].schema(), other.close);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.last)) {
        this.last = data().deepCopy(fields()[6].schema(), other.last);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.previousClose)) {
        this.previousClose = data().deepCopy(fields()[7].schema(), other.previousClose);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.totalTradedQty)) {
        this.totalTradedQty = data().deepCopy(fields()[8].schema(), other.totalTradedQty);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.totalTradedVal)) {
        this.totalTradedVal = data().deepCopy(fields()[9].schema(), other.totalTradedVal);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.tradeDate)) {
        this.tradeDate = data().deepCopy(fields()[10].schema(), other.tradeDate);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.totalTrades)) {
        this.totalTrades = data().deepCopy(fields()[11].schema(), other.totalTrades);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.isinCode)) {
        this.isinCode = data().deepCopy(fields()[12].schema(), other.isinCode);
        fieldSetFlags()[12] = true;
      }
    }

    /**
      * Gets the value of the 'symbol' field.
      * @return The value.
      */
    public java.lang.CharSequence getSymbol() {
      return symbol;
    }

    /**
      * Sets the value of the 'symbol' field.
      * @param value The value of 'symbol'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setSymbol(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.symbol = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'symbol' field has been set.
      * @return True if the 'symbol' field has been set, false otherwise.
      */
    public boolean hasSymbol() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'symbol' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearSymbol() {
      symbol = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'series' field.
      * @return The value.
      */
    public java.lang.CharSequence getSeries() {
      return series;
    }

    /**
      * Sets the value of the 'series' field.
      * @param value The value of 'series'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setSeries(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.series = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'series' field has been set.
      * @return True if the 'series' field has been set, false otherwise.
      */
    public boolean hasSeries() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'series' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearSeries() {
      series = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'open' field.
      * @return The value.
      */
    public java.lang.Float getOpen() {
      return open;
    }

    /**
      * Sets the value of the 'open' field.
      * @param value The value of 'open'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setOpen(java.lang.Float value) {
      validate(fields()[2], value);
      this.open = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'open' field has been set.
      * @return True if the 'open' field has been set, false otherwise.
      */
    public boolean hasOpen() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'open' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearOpen() {
      open = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'high' field.
      * @return The value.
      */
    public java.lang.Float getHigh() {
      return high;
    }

    /**
      * Sets the value of the 'high' field.
      * @param value The value of 'high'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setHigh(java.lang.Float value) {
      validate(fields()[3], value);
      this.high = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'high' field has been set.
      * @return True if the 'high' field has been set, false otherwise.
      */
    public boolean hasHigh() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'high' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearHigh() {
      high = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'low' field.
      * @return The value.
      */
    public java.lang.Float getLow() {
      return low;
    }

    /**
      * Sets the value of the 'low' field.
      * @param value The value of 'low'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setLow(java.lang.Float value) {
      validate(fields()[4], value);
      this.low = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'low' field has been set.
      * @return True if the 'low' field has been set, false otherwise.
      */
    public boolean hasLow() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'low' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearLow() {
      low = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'close' field.
      * @return The value.
      */
    public java.lang.Float getClose() {
      return close;
    }

    /**
      * Sets the value of the 'close' field.
      * @param value The value of 'close'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setClose(java.lang.Float value) {
      validate(fields()[5], value);
      this.close = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'close' field has been set.
      * @return True if the 'close' field has been set, false otherwise.
      */
    public boolean hasClose() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'close' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearClose() {
      close = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'last' field.
      * @return The value.
      */
    public java.lang.Float getLast() {
      return last;
    }

    /**
      * Sets the value of the 'last' field.
      * @param value The value of 'last'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setLast(java.lang.Float value) {
      validate(fields()[6], value);
      this.last = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'last' field has been set.
      * @return True if the 'last' field has been set, false otherwise.
      */
    public boolean hasLast() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'last' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearLast() {
      last = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'previousClose' field.
      * @return The value.
      */
    public java.lang.Float getPreviousClose() {
      return previousClose;
    }

    /**
      * Sets the value of the 'previousClose' field.
      * @param value The value of 'previousClose'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setPreviousClose(java.lang.Float value) {
      validate(fields()[7], value);
      this.previousClose = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'previousClose' field has been set.
      * @return True if the 'previousClose' field has been set, false otherwise.
      */
    public boolean hasPreviousClose() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'previousClose' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearPreviousClose() {
      previousClose = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalTradedQty' field.
      * @return The value.
      */
    public java.lang.Long getTotalTradedQty() {
      return totalTradedQty;
    }

    /**
      * Sets the value of the 'totalTradedQty' field.
      * @param value The value of 'totalTradedQty'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setTotalTradedQty(java.lang.Long value) {
      validate(fields()[8], value);
      this.totalTradedQty = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'totalTradedQty' field has been set.
      * @return True if the 'totalTradedQty' field has been set, false otherwise.
      */
    public boolean hasTotalTradedQty() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'totalTradedQty' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearTotalTradedQty() {
      totalTradedQty = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalTradedVal' field.
      * @return The value.
      */
    public java.lang.Double getTotalTradedVal() {
      return totalTradedVal;
    }

    /**
      * Sets the value of the 'totalTradedVal' field.
      * @param value The value of 'totalTradedVal'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setTotalTradedVal(java.lang.Double value) {
      validate(fields()[9], value);
      this.totalTradedVal = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'totalTradedVal' field has been set.
      * @return True if the 'totalTradedVal' field has been set, false otherwise.
      */
    public boolean hasTotalTradedVal() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'totalTradedVal' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearTotalTradedVal() {
      totalTradedVal = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'tradeDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getTradeDate() {
      return tradeDate;
    }

    /**
      * Sets the value of the 'tradeDate' field.
      * @param value The value of 'tradeDate'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setTradeDate(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.tradeDate = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'tradeDate' field has been set.
      * @return True if the 'tradeDate' field has been set, false otherwise.
      */
    public boolean hasTradeDate() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'tradeDate' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearTradeDate() {
      tradeDate = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'totalTrades' field.
      * @return The value.
      */
    public java.lang.Integer getTotalTrades() {
      return totalTrades;
    }

    /**
      * Sets the value of the 'totalTrades' field.
      * @param value The value of 'totalTrades'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setTotalTrades(java.lang.Integer value) {
      validate(fields()[11], value);
      this.totalTrades = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'totalTrades' field has been set.
      * @return True if the 'totalTrades' field has been set, false otherwise.
      */
    public boolean hasTotalTrades() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'totalTrades' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearTotalTrades() {
      totalTrades = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'isinCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getIsinCode() {
      return isinCode;
    }

    /**
      * Sets the value of the 'isinCode' field.
      * @param value The value of 'isinCode'.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder setIsinCode(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.isinCode = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'isinCode' field has been set.
      * @return True if the 'isinCode' field has been set, false otherwise.
      */
    public boolean hasIsinCode() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'isinCode' field.
      * @return This builder.
      */
    public guru.learningjournal.kafka.examples.StockData.Builder clearIsinCode() {
      isinCode = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    @Override
    public StockData build() {
      try {
        StockData record = new StockData();
        record.symbol = fieldSetFlags()[0] ? this.symbol : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.series = fieldSetFlags()[1] ? this.series : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.open = fieldSetFlags()[2] ? this.open : (java.lang.Float) defaultValue(fields()[2]);
        record.high = fieldSetFlags()[3] ? this.high : (java.lang.Float) defaultValue(fields()[3]);
        record.low = fieldSetFlags()[4] ? this.low : (java.lang.Float) defaultValue(fields()[4]);
        record.close = fieldSetFlags()[5] ? this.close : (java.lang.Float) defaultValue(fields()[5]);
        record.last = fieldSetFlags()[6] ? this.last : (java.lang.Float) defaultValue(fields()[6]);
        record.previousClose = fieldSetFlags()[7] ? this.previousClose : (java.lang.Float) defaultValue(fields()[7]);
        record.totalTradedQty = fieldSetFlags()[8] ? this.totalTradedQty : (java.lang.Long) defaultValue(fields()[8]);
        record.totalTradedVal = fieldSetFlags()[9] ? this.totalTradedVal : (java.lang.Double) defaultValue(fields()[9]);
        record.tradeDate = fieldSetFlags()[10] ? this.tradeDate : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.totalTrades = fieldSetFlags()[11] ? this.totalTrades : (java.lang.Integer) defaultValue(fields()[11]);
        record.isinCode = fieldSetFlags()[12] ? this.isinCode : (java.lang.CharSequence) defaultValue(fields()[12]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
