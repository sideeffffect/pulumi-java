// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetDatetimeOptions extends io.pulumi.resources.InvokeArgs {

    public static final DatasetDatetimeOptions Empty = new DatasetDatetimeOptions();

    /**
     * Date/time format of a date parameter
     * 
     */
    @InputImport(name="format", required=true)
      private final String format;

    public String getFormat() {
        return this.format;
    }

    /**
     * Locale code for a date parameter
     * 
     */
    @InputImport(name="localeCode")
      private final @Nullable String localeCode;

    public Optional<String> getLocaleCode() {
        return this.localeCode == null ? Optional.empty() : Optional.ofNullable(this.localeCode);
    }

    /**
     * Timezone offset
     * 
     */
    @InputImport(name="timezoneOffset")
      private final @Nullable String timezoneOffset;

    public Optional<String> getTimezoneOffset() {
        return this.timezoneOffset == null ? Optional.empty() : Optional.ofNullable(this.timezoneOffset);
    }

    public DatasetDatetimeOptions(
        String format,
        @Nullable String localeCode,
        @Nullable String timezoneOffset) {
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.localeCode = localeCode;
        this.timezoneOffset = timezoneOffset;
    }

    private DatasetDatetimeOptions() {
        this.format = null;
        this.localeCode = null;
        this.timezoneOffset = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDatetimeOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String format;
        private @Nullable String localeCode;
        private @Nullable String timezoneOffset;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDatetimeOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.localeCode = defaults.localeCode;
    	      this.timezoneOffset = defaults.timezoneOffset;
        }

        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder localeCode(@Nullable String localeCode) {
            this.localeCode = localeCode;
            return this;
        }

        public Builder timezoneOffset(@Nullable String timezoneOffset) {
            this.timezoneOffset = timezoneOffset;
            return this;
        }
        public DatasetDatetimeOptions build() {
            return new DatasetDatetimeOptions(format, localeCode, timezoneOffset);
        }
    }
}
