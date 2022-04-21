// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.pubsub.inputs.SubscriptionPushConfigOidcTokenGetArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionPushConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionPushConfigGetArgs Empty = new SubscriptionPushConfigGetArgs();

    /**
     * Endpoint configuration attributes.
     * Every endpoint has a set of API supported attributes that can
     * be used to control different aspects of the message delivery.
     * The currently supported attribute is x-goog-version, which you
     * can use to change the format of the pushed message. This
     * attribute indicates the version of the data expected by
     * the endpoint. This controls the shape of the pushed message
     * (i.e., its fields and metadata). The endpoint version is
     * based on the version of the Pub/Sub API.
     * If not present during the subscriptions.create call,
     * it will default to the version of the API used to make
     * such call. If not present during a subscriptions.modifyPushConfig
     * call, its value will not be changed. subscriptions.get
     * calls will always return a valid version, even if the
     * subscription was created without this attribute.
     * The possible values for this attribute are:
     * - v1beta1: uses the push format defined in the v1beta1 Pub/Sub API.
     * - v1 or v1beta2: uses the push format defined in the v1 Pub/Sub API.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<Map<String,String>> attributes;

    public Optional<Output<Map<String,String>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * If specified, Pub/Sub will generate and attach an OIDC JWT token as
     * an Authorization header in the HTTP request for every pushed message.
     * Structure is documented below.
     * 
     */
    @Import(name="oidcToken")
    private @Nullable Output<SubscriptionPushConfigOidcTokenGetArgs> oidcToken;

    public Optional<Output<SubscriptionPushConfigOidcTokenGetArgs>> oidcToken() {
        return Optional.ofNullable(this.oidcToken);
    }

    /**
     * A URL locating the endpoint to which messages should be pushed.
     * For example, a Webhook endpoint might use
     * &#34;https://example.com/push&#34;.
     * 
     */
    @Import(name="pushEndpoint", required=true)
    private Output<String> pushEndpoint;

    public Output<String> pushEndpoint() {
        return this.pushEndpoint;
    }

    private SubscriptionPushConfigGetArgs() {}

    private SubscriptionPushConfigGetArgs(SubscriptionPushConfigGetArgs $) {
        this.attributes = $.attributes;
        this.oidcToken = $.oidcToken;
        this.pushEndpoint = $.pushEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionPushConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionPushConfigGetArgs $;

        public Builder() {
            $ = new SubscriptionPushConfigGetArgs();
        }

        public Builder(SubscriptionPushConfigGetArgs defaults) {
            $ = new SubscriptionPushConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributes(@Nullable Output<Map<String,String>> attributes) {
            $.attributes = attributes;
            return this;
        }

        public Builder attributes(Map<String,String> attributes) {
            return attributes(Output.of(attributes));
        }

        public Builder oidcToken(@Nullable Output<SubscriptionPushConfigOidcTokenGetArgs> oidcToken) {
            $.oidcToken = oidcToken;
            return this;
        }

        public Builder oidcToken(SubscriptionPushConfigOidcTokenGetArgs oidcToken) {
            return oidcToken(Output.of(oidcToken));
        }

        public Builder pushEndpoint(Output<String> pushEndpoint) {
            $.pushEndpoint = pushEndpoint;
            return this;
        }

        public Builder pushEndpoint(String pushEndpoint) {
            return pushEndpoint(Output.of(pushEndpoint));
        }

        public SubscriptionPushConfigGetArgs build() {
            $.pushEndpoint = Objects.requireNonNull($.pushEndpoint, "expected parameter 'pushEndpoint' to be non-null");
            return $;
        }
    }

}
