// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClientIPConfig {
    /**
     * @return timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be &gt;0 &amp;&amp; &lt;=86400(for 1 day) if ServiceAffinity == &#34;ClientIP&#34;. Default value is 10800(for 3 hours).
     * 
     */
    private final @Nullable Integer timeoutSeconds;

    @CustomType.Constructor
    private ClientIPConfig(@CustomType.Parameter("timeoutSeconds") @Nullable Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * @return timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be &gt;0 &amp;&amp; &lt;=86400(for 1 day) if ServiceAffinity == &#34;ClientIP&#34;. Default value is 10800(for 3 hours).
     * 
     */
    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientIPConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer timeoutSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientIPConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }        public ClientIPConfig build() {
            return new ClientIPConfig(timeoutSeconds);
        }
    }
}
