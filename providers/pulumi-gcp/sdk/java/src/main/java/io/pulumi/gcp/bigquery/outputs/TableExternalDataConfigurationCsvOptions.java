// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableExternalDataConfigurationCsvOptions {
    /**
     * Indicates if BigQuery should accept rows
     * that are missing trailing optional columns.
     * 
     */
    private final @Nullable Boolean allowJaggedRows;
    /**
     * Indicates if BigQuery should allow
     * quoted data sections that contain newline characters in a CSV file.
     * The default value is false.
     * 
     */
    private final @Nullable Boolean allowQuotedNewlines;
    /**
     * The character encoding of the data. The supported
     * values are UTF-8 or ISO-8859-1.
     * 
     */
    private final @Nullable String encoding;
    /**
     * The separator for fields in a CSV file.
     * 
     */
    private final @Nullable String fieldDelimiter;
    /**
     * The value that is used to quote data sections in a
     * CSV file. If your data does not contain quoted sections, set the
     * property value to an empty string. If your data contains quoted newline
     * characters, you must also set the `allow_quoted_newlines` property to true.
     * The API-side default is `"`, specified in the provider escaped as `\"`. Due to
     * limitations with default values, this value is required to be
     * explicitly set.
     * 
     */
    private final String quote;
    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
     */
    private final @Nullable Integer skipLeadingRows;

    @OutputCustomType.Constructor
    private TableExternalDataConfigurationCsvOptions(
        @OutputCustomType.Parameter("allowJaggedRows") @Nullable Boolean allowJaggedRows,
        @OutputCustomType.Parameter("allowQuotedNewlines") @Nullable Boolean allowQuotedNewlines,
        @OutputCustomType.Parameter("encoding") @Nullable String encoding,
        @OutputCustomType.Parameter("fieldDelimiter") @Nullable String fieldDelimiter,
        @OutputCustomType.Parameter("quote") String quote,
        @OutputCustomType.Parameter("skipLeadingRows") @Nullable Integer skipLeadingRows) {
        this.allowJaggedRows = allowJaggedRows;
        this.allowQuotedNewlines = allowQuotedNewlines;
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.quote = quote;
        this.skipLeadingRows = skipLeadingRows;
    }

    /**
     * Indicates if BigQuery should accept rows
     * that are missing trailing optional columns.
     * 
    */
    public Optional<Boolean> getAllowJaggedRows() {
        return Optional.ofNullable(this.allowJaggedRows);
    }
    /**
     * Indicates if BigQuery should allow
     * quoted data sections that contain newline characters in a CSV file.
     * The default value is false.
     * 
    */
    public Optional<Boolean> getAllowQuotedNewlines() {
        return Optional.ofNullable(this.allowQuotedNewlines);
    }
    /**
     * The character encoding of the data. The supported
     * values are UTF-8 or ISO-8859-1.
     * 
    */
    public Optional<String> getEncoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * The separator for fields in a CSV file.
     * 
    */
    public Optional<String> getFieldDelimiter() {
        return Optional.ofNullable(this.fieldDelimiter);
    }
    /**
     * The value that is used to quote data sections in a
     * CSV file. If your data does not contain quoted sections, set the
     * property value to an empty string. If your data contains quoted newline
     * characters, you must also set the `allow_quoted_newlines` property to true.
     * The API-side default is `"`, specified in the provider escaped as `\"`. Due to
     * limitations with default values, this value is required to be
     * explicitly set.
     * 
    */
    public String getQuote() {
        return this.quote;
    }
    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
    */
    public Optional<Integer> getSkipLeadingRows() {
        return Optional.ofNullable(this.skipLeadingRows);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationCsvOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowJaggedRows;
        private @Nullable Boolean allowQuotedNewlines;
        private @Nullable String encoding;
        private @Nullable String fieldDelimiter;
        private String quote;
        private @Nullable Integer skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationCsvOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowJaggedRows = defaults.allowJaggedRows;
    	      this.allowQuotedNewlines = defaults.allowQuotedNewlines;
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.quote = defaults.quote;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder allowJaggedRows(@Nullable Boolean allowJaggedRows) {
            this.allowJaggedRows = allowJaggedRows;
            return this;
        }

        public Builder allowQuotedNewlines(@Nullable Boolean allowQuotedNewlines) {
            this.allowQuotedNewlines = allowQuotedNewlines;
            return this;
        }

        public Builder encoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }

        public Builder fieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        public Builder quote(String quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }

        public Builder skipLeadingRows(@Nullable Integer skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }
        public TableExternalDataConfigurationCsvOptions build() {
            return new TableExternalDataConfigurationCsvOptions(allowJaggedRows, allowQuotedNewlines, encoding, fieldDelimiter, quote, skipLeadingRows);
        }
    }
}
