// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subscription key parameter names details.
 * 
 */
public final class SubscriptionKeyParameterNamesContractResponse extends com.pulumi.resources.InvokeArgs {

    public static final SubscriptionKeyParameterNamesContractResponse Empty = new SubscriptionKeyParameterNamesContractResponse();

    /**
     * Subscription key header name.
     * 
     */
    @Import(name="header")
    private @Nullable String header;

    public Optional<String> header() {
        return Optional.ofNullable(this.header);
    }

    /**
     * Subscription key query string parameter name.
     * 
     */
    @Import(name="query")
    private @Nullable String query;

    public Optional<String> query() {
        return Optional.ofNullable(this.query);
    }

    private SubscriptionKeyParameterNamesContractResponse() {}

    private SubscriptionKeyParameterNamesContractResponse(SubscriptionKeyParameterNamesContractResponse $) {
        this.header = $.header;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionKeyParameterNamesContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionKeyParameterNamesContractResponse $;

        public Builder() {
            $ = new SubscriptionKeyParameterNamesContractResponse();
        }

        public Builder(SubscriptionKeyParameterNamesContractResponse defaults) {
            $ = new SubscriptionKeyParameterNamesContractResponse(Objects.requireNonNull(defaults));
        }

        public Builder header(@Nullable String header) {
            $.header = header;
            return this;
        }

        public Builder query(@Nullable String query) {
            $.query = query;
            return this;
        }

        public SubscriptionKeyParameterNamesContractResponse build() {
            return $;
        }
    }

}
