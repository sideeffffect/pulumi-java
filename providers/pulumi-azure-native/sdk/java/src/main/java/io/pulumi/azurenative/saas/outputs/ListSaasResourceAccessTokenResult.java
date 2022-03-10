// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListSaasResourceAccessTokenResult {
    /**
     * The Publisher Offer Base Uri
     * 
     */
    private final @Nullable String publisherOfferBaseUri;
    /**
     * The generated token
     * 
     */
    private final @Nullable String token;

    @OutputCustomType.Constructor
    private ListSaasResourceAccessTokenResult(
        @OutputCustomType.Parameter("publisherOfferBaseUri") @Nullable String publisherOfferBaseUri,
        @OutputCustomType.Parameter("token") @Nullable String token) {
        this.publisherOfferBaseUri = publisherOfferBaseUri;
        this.token = token;
    }

    /**
     * The Publisher Offer Base Uri
     * 
    */
    public Optional<String> getPublisherOfferBaseUri() {
        return Optional.ofNullable(this.publisherOfferBaseUri);
    }
    /**
     * The generated token
     * 
    */
    public Optional<String> getToken() {
        return Optional.ofNullable(this.token);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListSaasResourceAccessTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publisherOfferBaseUri;
        private @Nullable String token;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSaasResourceAccessTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publisherOfferBaseUri = defaults.publisherOfferBaseUri;
    	      this.token = defaults.token;
        }

        public Builder publisherOfferBaseUri(@Nullable String publisherOfferBaseUri) {
            this.publisherOfferBaseUri = publisherOfferBaseUri;
            return this;
        }

        public Builder token(@Nullable String token) {
            this.token = token;
            return this;
        }
        public ListSaasResourceAccessTokenResult build() {
            return new ListSaasResourceAccessTokenResult(publisherOfferBaseUri, token);
        }
    }
}
