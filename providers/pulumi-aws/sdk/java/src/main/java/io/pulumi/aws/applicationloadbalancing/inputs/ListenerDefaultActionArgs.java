// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.inputs;

import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionAuthenticateCognitoArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionAuthenticateOidcArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionFixedResponseArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionForwardArgs;
import io.pulumi.aws.applicationloadbalancing.inputs.ListenerDefaultActionRedirectArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionArgs Empty = new ListenerDefaultActionArgs();

    /**
     * Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
     */
    @Import(name="authenticateCognito")
      private final @Nullable Output<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito;

    public Output<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito() {
        return this.authenticateCognito == null ? Codegen.empty() : this.authenticateCognito;
    }

    /**
     * Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
     */
    @Import(name="authenticateOidc")
      private final @Nullable Output<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc;

    public Output<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc() {
        return this.authenticateOidc == null ? Codegen.empty() : this.authenticateOidc;
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @Import(name="fixedResponse")
      private final @Nullable Output<ListenerDefaultActionFixedResponseArgs> fixedResponse;

    public Output<ListenerDefaultActionFixedResponseArgs> fixedResponse() {
        return this.fixedResponse == null ? Codegen.empty() : this.fixedResponse;
    }

    /**
     * Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
     */
    @Import(name="forward")
      private final @Nullable Output<ListenerDefaultActionForwardArgs> forward;

    public Output<ListenerDefaultActionForwardArgs> forward() {
        return this.forward == null ? Codegen.empty() : this.forward;
    }

    /**
     * Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
     */
    @Import(name="order")
      private final @Nullable Output<Integer> order;

    public Output<Integer> order() {
        return this.order == null ? Codegen.empty() : this.order;
    }

    /**
     * Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
     */
    @Import(name="redirect")
      private final @Nullable Output<ListenerDefaultActionRedirectArgs> redirect;

    public Output<ListenerDefaultActionRedirectArgs> redirect() {
        return this.redirect == null ? Codegen.empty() : this.redirect;
    }

    /**
     * ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> targetGroupArn() {
        return this.targetGroupArn == null ? Codegen.empty() : this.targetGroupArn;
    }

    /**
     * Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public ListenerDefaultActionArgs(
        @Nullable Output<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito,
        @Nullable Output<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc,
        @Nullable Output<ListenerDefaultActionFixedResponseArgs> fixedResponse,
        @Nullable Output<ListenerDefaultActionForwardArgs> forward,
        @Nullable Output<Integer> order,
        @Nullable Output<ListenerDefaultActionRedirectArgs> redirect,
        @Nullable Output<String> targetGroupArn,
        Output<String> type) {
        this.authenticateCognito = authenticateCognito;
        this.authenticateOidc = authenticateOidc;
        this.fixedResponse = fixedResponse;
        this.forward = forward;
        this.order = order;
        this.redirect = redirect;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerDefaultActionArgs() {
        this.authenticateCognito = Codegen.empty();
        this.authenticateOidc = Codegen.empty();
        this.fixedResponse = Codegen.empty();
        this.forward = Codegen.empty();
        this.order = Codegen.empty();
        this.redirect = Codegen.empty();
        this.targetGroupArn = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito;
        private @Nullable Output<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc;
        private @Nullable Output<ListenerDefaultActionFixedResponseArgs> fixedResponse;
        private @Nullable Output<ListenerDefaultActionForwardArgs> forward;
        private @Nullable Output<Integer> order;
        private @Nullable Output<ListenerDefaultActionRedirectArgs> redirect;
        private @Nullable Output<String> targetGroupArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognito = defaults.authenticateCognito;
    	      this.authenticateOidc = defaults.authenticateOidc;
    	      this.fixedResponse = defaults.fixedResponse;
    	      this.forward = defaults.forward;
    	      this.order = defaults.order;
    	      this.redirect = defaults.redirect;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognito(@Nullable Output<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }
        public Builder authenticateCognito(@Nullable ListenerDefaultActionAuthenticateCognitoArgs authenticateCognito) {
            this.authenticateCognito = Codegen.ofNullable(authenticateCognito);
            return this;
        }
        public Builder authenticateOidc(@Nullable Output<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }
        public Builder authenticateOidc(@Nullable ListenerDefaultActionAuthenticateOidcArgs authenticateOidc) {
            this.authenticateOidc = Codegen.ofNullable(authenticateOidc);
            return this;
        }
        public Builder fixedResponse(@Nullable Output<ListenerDefaultActionFixedResponseArgs> fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }
        public Builder fixedResponse(@Nullable ListenerDefaultActionFixedResponseArgs fixedResponse) {
            this.fixedResponse = Codegen.ofNullable(fixedResponse);
            return this;
        }
        public Builder forward(@Nullable Output<ListenerDefaultActionForwardArgs> forward) {
            this.forward = forward;
            return this;
        }
        public Builder forward(@Nullable ListenerDefaultActionForwardArgs forward) {
            this.forward = Codegen.ofNullable(forward);
            return this;
        }
        public Builder order(@Nullable Output<Integer> order) {
            this.order = order;
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = Codegen.ofNullable(order);
            return this;
        }
        public Builder redirect(@Nullable Output<ListenerDefaultActionRedirectArgs> redirect) {
            this.redirect = redirect;
            return this;
        }
        public Builder redirect(@Nullable ListenerDefaultActionRedirectArgs redirect) {
            this.redirect = Codegen.ofNullable(redirect);
            return this;
        }
        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Codegen.ofNullable(targetGroupArn);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ListenerDefaultActionArgs build() {
            return new ListenerDefaultActionArgs(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
