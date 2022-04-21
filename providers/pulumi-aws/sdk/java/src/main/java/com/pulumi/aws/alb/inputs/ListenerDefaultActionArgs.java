// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb.inputs;

import com.pulumi.aws.alb.inputs.ListenerDefaultActionAuthenticateCognitoArgs;
import com.pulumi.aws.alb.inputs.ListenerDefaultActionAuthenticateOidcArgs;
import com.pulumi.aws.alb.inputs.ListenerDefaultActionFixedResponseArgs;
import com.pulumi.aws.alb.inputs.ListenerDefaultActionForwardArgs;
import com.pulumi.aws.alb.inputs.ListenerDefaultActionRedirectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerDefaultActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionArgs Empty = new ListenerDefaultActionArgs();

    /**
     * Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
     */
    @Import(name="authenticateCognito")
    private @Nullable Output<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito;

    public Optional<Output<ListenerDefaultActionAuthenticateCognitoArgs>> authenticateCognito() {
        return Optional.ofNullable(this.authenticateCognito);
    }

    /**
     * Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
     */
    @Import(name="authenticateOidc")
    private @Nullable Output<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc;

    public Optional<Output<ListenerDefaultActionAuthenticateOidcArgs>> authenticateOidc() {
        return Optional.ofNullable(this.authenticateOidc);
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @Import(name="fixedResponse")
    private @Nullable Output<ListenerDefaultActionFixedResponseArgs> fixedResponse;

    public Optional<Output<ListenerDefaultActionFixedResponseArgs>> fixedResponse() {
        return Optional.ofNullable(this.fixedResponse);
    }

    /**
     * Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
     */
    @Import(name="forward")
    private @Nullable Output<ListenerDefaultActionForwardArgs> forward;

    public Optional<Output<ListenerDefaultActionForwardArgs>> forward() {
        return Optional.ofNullable(this.forward);
    }

    /**
     * Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
     */
    @Import(name="redirect")
    private @Nullable Output<ListenerDefaultActionRedirectArgs> redirect;

    public Optional<Output<ListenerDefaultActionRedirectArgs>> redirect() {
        return Optional.ofNullable(this.redirect);
    }

    /**
     * ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @Import(name="targetGroupArn")
    private @Nullable Output<String> targetGroupArn;

    public Optional<Output<String>> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    /**
     * Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ListenerDefaultActionArgs() {}

    private ListenerDefaultActionArgs(ListenerDefaultActionArgs $) {
        this.authenticateCognito = $.authenticateCognito;
        this.authenticateOidc = $.authenticateOidc;
        this.fixedResponse = $.fixedResponse;
        this.forward = $.forward;
        this.order = $.order;
        this.redirect = $.redirect;
        this.targetGroupArn = $.targetGroupArn;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerDefaultActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerDefaultActionArgs $;

        public Builder() {
            $ = new ListenerDefaultActionArgs();
        }

        public Builder(ListenerDefaultActionArgs defaults) {
            $ = new ListenerDefaultActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder authenticateCognito(@Nullable Output<ListenerDefaultActionAuthenticateCognitoArgs> authenticateCognito) {
            $.authenticateCognito = authenticateCognito;
            return this;
        }

        public Builder authenticateCognito(ListenerDefaultActionAuthenticateCognitoArgs authenticateCognito) {
            return authenticateCognito(Output.of(authenticateCognito));
        }

        public Builder authenticateOidc(@Nullable Output<ListenerDefaultActionAuthenticateOidcArgs> authenticateOidc) {
            $.authenticateOidc = authenticateOidc;
            return this;
        }

        public Builder authenticateOidc(ListenerDefaultActionAuthenticateOidcArgs authenticateOidc) {
            return authenticateOidc(Output.of(authenticateOidc));
        }

        public Builder fixedResponse(@Nullable Output<ListenerDefaultActionFixedResponseArgs> fixedResponse) {
            $.fixedResponse = fixedResponse;
            return this;
        }

        public Builder fixedResponse(ListenerDefaultActionFixedResponseArgs fixedResponse) {
            return fixedResponse(Output.of(fixedResponse));
        }

        public Builder forward(@Nullable Output<ListenerDefaultActionForwardArgs> forward) {
            $.forward = forward;
            return this;
        }

        public Builder forward(ListenerDefaultActionForwardArgs forward) {
            return forward(Output.of(forward));
        }

        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public Builder redirect(@Nullable Output<ListenerDefaultActionRedirectArgs> redirect) {
            $.redirect = redirect;
            return this;
        }

        public Builder redirect(ListenerDefaultActionRedirectArgs redirect) {
            return redirect(Output.of(redirect));
        }

        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            $.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder targetGroupArn(String targetGroupArn) {
            return targetGroupArn(Output.of(targetGroupArn));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ListenerDefaultActionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
