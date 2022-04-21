// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogAnalyticsConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogAnalyticsConfigurationResponse Empty = new LogAnalyticsConfigurationResponse();

    @Import(name="customerId")
    private @Nullable String customerId;

    public Optional<String> customerId() {
        return Optional.ofNullable(this.customerId);
    }

    private LogAnalyticsConfigurationResponse() {}

    private LogAnalyticsConfigurationResponse(LogAnalyticsConfigurationResponse $) {
        this.customerId = $.customerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAnalyticsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAnalyticsConfigurationResponse $;

        public Builder() {
            $ = new LogAnalyticsConfigurationResponse();
        }

        public Builder(LogAnalyticsConfigurationResponse defaults) {
            $ = new LogAnalyticsConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder customerId(@Nullable String customerId) {
            $.customerId = customerId;
            return this;
        }

        public LogAnalyticsConfigurationResponse build() {
            return $;
        }
    }

}
