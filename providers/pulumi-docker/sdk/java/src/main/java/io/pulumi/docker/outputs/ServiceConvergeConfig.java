// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceConvergeConfig {
    private final @Nullable String delay;
    private final @Nullable String timeout;

    @OutputCustomType.Constructor
    private ServiceConvergeConfig(
        @OutputCustomType.Parameter("delay") @Nullable String delay,
        @OutputCustomType.Parameter("timeout") @Nullable String timeout) {
        this.delay = delay;
        this.timeout = timeout;
    }

    public Optional<String> getDelay() {
        return Optional.ofNullable(this.delay);
    }
    public Optional<String> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceConvergeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String delay;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceConvergeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delay = defaults.delay;
    	      this.timeout = defaults.timeout;
        }

        public Builder delay(@Nullable String delay) {
            this.delay = delay;
            return this;
        }

        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }
        public ServiceConvergeConfig build() {
            return new ServiceConvergeConfig(delay, timeout);
        }
    }
}
