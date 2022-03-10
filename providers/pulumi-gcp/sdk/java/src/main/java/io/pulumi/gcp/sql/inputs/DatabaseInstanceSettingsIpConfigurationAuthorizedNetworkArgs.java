// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs Empty = new DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs();

    /**
     * The [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * formatted date time string indicating when this whitelist expires.
     * 
     */
    @InputImport(name="expirationTime")
      private final @Nullable Input<String> expirationTime;

    public Input<String> getExpirationTime() {
        return this.expirationTime == null ? Input.empty() : this.expirationTime;
    }

    /**
     * A name for this whitelist entry.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A CIDR notation IPv4 or IPv6 address that is allowed to
     * access this instance. Must be set even if other two attributes are not for
     * the whitelist to become active.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs(
        @Nullable Input<String> expirationTime,
        @Nullable Input<String> name,
        Input<String> value) {
        this.expirationTime = expirationTime;
        this.name = name;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs() {
        this.expirationTime = Input.empty();
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> expirationTime;
        private @Nullable Input<String> name;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder expirationTime(@Nullable Input<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Input.ofNullable(expirationTime);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder value(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs build() {
            return new DatabaseInstanceSettingsIpConfigurationAuthorizedNetworkArgs(expirationTime, name, value);
        }
    }
}
