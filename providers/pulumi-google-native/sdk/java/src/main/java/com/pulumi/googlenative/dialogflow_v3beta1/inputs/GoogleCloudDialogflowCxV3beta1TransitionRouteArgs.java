// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A transition route specifies a intent that can be matched and/or a data condition that can be evaluated during a session. When a specified transition is matched, the following actions are taken in order: * If there is a `trigger_fulfillment` associated with the transition, it will be called. * If there is a `target_page` associated with the transition, the session will transition into the specified page. * If there is a `target_flow` associated with the transition, the session will transition into the specified flow.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1TransitionRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1TransitionRouteArgs Empty = new GoogleCloudDialogflowCxV3beta1TransitionRouteArgs();

    /**
     * The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<String> condition;

    public Optional<Output<String>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
     * 
     */
    @Import(name="intent")
    private @Nullable Output<String> intent;

    public Optional<Output<String>> intent() {
        return Optional.ofNullable(this.intent);
    }

    /**
     * The target flow to transition to. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="targetFlow")
    private @Nullable Output<String> targetFlow;

    public Optional<Output<String>> targetFlow() {
        return Optional.ofNullable(this.targetFlow);
    }

    /**
     * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @Import(name="targetPage")
    private @Nullable Output<String> targetPage;

    public Optional<Output<String>> targetPage() {
        return Optional.ofNullable(this.targetPage);
    }

    /**
     * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
     * 
     */
    @Import(name="triggerFulfillment")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> triggerFulfillment;

    public Optional<Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs>> triggerFulfillment() {
        return Optional.ofNullable(this.triggerFulfillment);
    }

    private GoogleCloudDialogflowCxV3beta1TransitionRouteArgs() {}

    private GoogleCloudDialogflowCxV3beta1TransitionRouteArgs(GoogleCloudDialogflowCxV3beta1TransitionRouteArgs $) {
        this.condition = $.condition;
        this.intent = $.intent;
        this.targetFlow = $.targetFlow;
        this.targetPage = $.targetPage;
        this.triggerFulfillment = $.triggerFulfillment;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1TransitionRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1TransitionRouteArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1TransitionRouteArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TransitionRouteArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1TransitionRouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<String> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        public Builder intent(@Nullable Output<String> intent) {
            $.intent = intent;
            return this;
        }

        public Builder intent(String intent) {
            return intent(Output.of(intent));
        }

        public Builder targetFlow(@Nullable Output<String> targetFlow) {
            $.targetFlow = targetFlow;
            return this;
        }

        public Builder targetFlow(String targetFlow) {
            return targetFlow(Output.of(targetFlow));
        }

        public Builder targetPage(@Nullable Output<String> targetPage) {
            $.targetPage = targetPage;
            return this;
        }

        public Builder targetPage(String targetPage) {
            return targetPage(Output.of(targetPage));
        }

        public Builder triggerFulfillment(@Nullable Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> triggerFulfillment) {
            $.triggerFulfillment = triggerFulfillment;
            return this;
        }

        public Builder triggerFulfillment(GoogleCloudDialogflowCxV3beta1FulfillmentArgs triggerFulfillment) {
            return triggerFulfillment(Output.of(triggerFulfillment));
        }

        public GoogleCloudDialogflowCxV3beta1TransitionRouteArgs build() {
            return $;
        }
    }

}
