// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a time zone from the [IANA Time Zone Database](https://www.iana.org/time-zones).
 * 
 */
public final class TimeZoneResponse extends com.pulumi.resources.InvokeArgs {

    public static final TimeZoneResponse Empty = new TimeZoneResponse();

    /**
     * Optional. IANA Time Zone Database version number, e.g. &#34;2019a&#34;.
     * 
     */
    @Import(name="version", required=true)
    private String version;

    public String version() {
        return this.version;
    }

    private TimeZoneResponse() {}

    private TimeZoneResponse(TimeZoneResponse $) {
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeZoneResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeZoneResponse $;

        public Builder() {
            $ = new TimeZoneResponse();
        }

        public Builder(TimeZoneResponse defaults) {
            $ = new TimeZoneResponse(Objects.requireNonNull(defaults));
        }

        public Builder version(String version) {
            $.version = version;
            return this;
        }

        public TimeZoneResponse build() {
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
