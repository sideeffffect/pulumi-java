// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceIpAddressArgs extends ResourceArgs {

    public static final DatabaseInstanceIpAddressArgs Empty = new DatabaseInstanceIpAddressArgs();

    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    @Import(name="timeToRetire")
    private @Nullable Output<String> timeToRetire;

    public Optional<Output<String>> timeToRetire() {
        return Optional.ofNullable(this.timeToRetire);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private DatabaseInstanceIpAddressArgs() {}

    private DatabaseInstanceIpAddressArgs(DatabaseInstanceIpAddressArgs $) {
        this.ipAddress = $.ipAddress;
        this.timeToRetire = $.timeToRetire;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceIpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceIpAddressArgs $;

        public Builder() {
            $ = new DatabaseInstanceIpAddressArgs();
        }

        public Builder(DatabaseInstanceIpAddressArgs defaults) {
            $ = new DatabaseInstanceIpAddressArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public Builder timeToRetire(@Nullable Output<String> timeToRetire) {
            $.timeToRetire = timeToRetire;
            return this;
        }

        public Builder timeToRetire(String timeToRetire) {
            return timeToRetire(Output.of(timeToRetire));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DatabaseInstanceIpAddressArgs build() {
            return $;
        }
    }

}
