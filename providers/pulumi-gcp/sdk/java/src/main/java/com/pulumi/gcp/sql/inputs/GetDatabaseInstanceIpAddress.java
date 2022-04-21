// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatabaseInstanceIpAddress extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceIpAddress Empty = new GetDatabaseInstanceIpAddress();

    @Import(name="ipAddress", required=true)
    private String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    @Import(name="timeToRetire", required=true)
    private String timeToRetire;

    public String timeToRetire() {
        return this.timeToRetire;
    }

    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GetDatabaseInstanceIpAddress() {}

    private GetDatabaseInstanceIpAddress(GetDatabaseInstanceIpAddress $) {
        this.ipAddress = $.ipAddress;
        this.timeToRetire = $.timeToRetire;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseInstanceIpAddress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseInstanceIpAddress $;

        public Builder() {
            $ = new GetDatabaseInstanceIpAddress();
        }

        public Builder(GetDatabaseInstanceIpAddress defaults) {
            $ = new GetDatabaseInstanceIpAddress(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder timeToRetire(String timeToRetire) {
            $.timeToRetire = timeToRetire;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GetDatabaseInstanceIpAddress build() {
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            $.timeToRetire = Objects.requireNonNull($.timeToRetire, "expected parameter 'timeToRetire' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
