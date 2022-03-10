// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BrokerInstance {
    private final @Nullable String consoleUrl;
    private final @Nullable List<String> endpoints;
    private final @Nullable String ipAddress;

    @OutputCustomType.Constructor
    private BrokerInstance(
        @OutputCustomType.Parameter("consoleUrl") @Nullable String consoleUrl,
        @OutputCustomType.Parameter("endpoints") @Nullable List<String> endpoints,
        @OutputCustomType.Parameter("ipAddress") @Nullable String ipAddress) {
        this.consoleUrl = consoleUrl;
        this.endpoints = endpoints;
        this.ipAddress = ipAddress;
    }

    public Optional<String> getConsoleUrl() {
        return Optional.ofNullable(this.consoleUrl);
    }
    public List<String> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String consoleUrl;
        private @Nullable List<String> endpoints;
        private @Nullable String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleUrl = defaults.consoleUrl;
    	      this.endpoints = defaults.endpoints;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder consoleUrl(@Nullable String consoleUrl) {
            this.consoleUrl = consoleUrl;
            return this;
        }

        public Builder endpoints(@Nullable List<String> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public BrokerInstance build() {
            return new BrokerInstance(consoleUrl, endpoints, ipAddress);
        }
    }
}
