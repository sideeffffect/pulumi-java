// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TimeZoneResponse {
    /**
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * 
     */
    private final String version;

    @CustomType.Constructor
    private TimeZoneResponse(@CustomType.Parameter("version") String version) {
        this.version = version;
    }

    /**
     * Optional. IANA Time Zone Database version number, e.g. "2019a".
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeZoneResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeZoneResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public TimeZoneResponse build() {
            return new TimeZoneResponse(version);
        }
    }
}
