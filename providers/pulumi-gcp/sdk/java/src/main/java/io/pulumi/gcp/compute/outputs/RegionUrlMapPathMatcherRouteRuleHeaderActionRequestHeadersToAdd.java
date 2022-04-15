// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegionUrlMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd {
    /**
     * The name of the header.
     * 
     */
    private final String headerName;
    /**
     * The value of the header to add.
     * 
     */
    private final String headerValue;
    /**
     * If false, headerValue is appended to any values that already exist for the
     * header. If true, headerValue is set for the header, discarding any values that
     * were set for that header.
     * 
     */
    private final Boolean replace;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd(
        @CustomType.Parameter("headerName") String headerName,
        @CustomType.Parameter("headerValue") String headerValue,
        @CustomType.Parameter("replace") Boolean replace) {
        this.headerName = headerName;
        this.headerValue = headerValue;
        this.replace = replace;
    }

    /**
     * The name of the header.
     * 
    */
    public String headerName() {
        return this.headerName;
    }
    /**
     * The value of the header to add.
     * 
    */
    public String headerValue() {
        return this.headerValue;
    }
    /**
     * If false, headerValue is appended to any values that already exist for the
     * header. If true, headerValue is set for the header, discarding any values that
     * were set for that header.
     * 
    */
    public Boolean replace() {
        return this.replace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;
        private String headerValue;
        private Boolean replace;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }
        public Builder replace(Boolean replace) {
            this.replace = Objects.requireNonNull(replace);
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd build() {
            return new RegionUrlMapPathMatcherRouteRuleHeaderActionRequestHeadersToAdd(headerName, headerValue, replace);
        }
    }
}
