// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dialogflow.v3beta1.FlowArgs;
import com.pulumi.googlenative.dialogflow.v3beta1.outputs.GoogleCloudDialogflowCxV3beta1EventHandlerResponse;
import com.pulumi.googlenative.dialogflow.v3beta1.outputs.GoogleCloudDialogflowCxV3beta1NluSettingsResponse;
import com.pulumi.googlenative.dialogflow.v3beta1.outputs.GoogleCloudDialogflowCxV3beta1TransitionRouteResponse;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a flow in the specified agent. Note: You should always train a flow prior to sending it queries. See the [training documentation](https://cloud.google.com/dialogflow/cx/docs/concept/training).
 * 
 */
@ResourceType(type="google-native:dialogflow/v3beta1:Flow")
public class Flow extends com.pulumi.resources.CustomResource {
    @Export(name="agentId", type=String.class, parameters={})
    private Output<String> agentId;

    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The human-readable name of the flow.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the flow.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A flow&#39;s event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page&#39;s event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * 
     */
    @Export(name="eventHandlers", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1EventHandlerResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse>> eventHandlers;

    /**
     * @return A flow&#39;s event handlers serve two purposes: * They are responsible for handling events (e.g. no match, webhook errors) in the flow. * They are inherited by every page&#39;s event handlers, which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow. Unlike transition_routes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerResponse>> eventHandlers() {
        return this.eventHandlers;
    }
    /**
     * The language of the following fields in `flow`: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in `flow`: * `Flow.event_handlers.trigger_fulfillment.messages` * `Flow.event_handlers.trigger_fulfillment.conditional_cases` * `Flow.transition_routes.trigger_fulfillment.messages` * `Flow.transition_routes.trigger_fulfillment.conditional_cases` If not specified, the agent&#39;s default language is used. [Many languages](https://cloud.google.com/dialogflow/cx/docs/reference/language) are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output<Optional<String>> languageCode() {
        return Codegen.optional(this.languageCode);
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of the flow. Format: `projects//locations//agents//flows/`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * NLU related settings of the flow.
     * 
     */
    @Export(name="nluSettings", type=GoogleCloudDialogflowCxV3beta1NluSettingsResponse.class, parameters={})
    private Output<GoogleCloudDialogflowCxV3beta1NluSettingsResponse> nluSettings;

    /**
     * @return NLU related settings of the flow.
     * 
     */
    public Output<GoogleCloudDialogflowCxV3beta1NluSettingsResponse> nluSettings() {
        return this.nluSettings;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * A flow&#39;s transition route group serve two purposes: * They are responsible for matching the user&#39;s first utterances in the flow. * They are inherited by every page&#39;s transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @Export(name="transitionRouteGroups", type=List.class, parameters={String.class})
    private Output<List<String>> transitionRouteGroups;

    /**
     * @return A flow&#39;s transition route group serve two purposes: * They are responsible for matching the user&#39;s first utterances in the flow. * They are inherited by every page&#39;s transition route groups. Transition route groups defined in the page have higher priority than those defined in the flow. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    public Output<List<String>> transitionRouteGroups() {
        return this.transitionRouteGroups;
    }
    /**
     * A flow&#39;s transition routes serve two purposes: * They are responsible for matching the user&#39;s first utterances in the flow. * They are inherited by every page&#39;s transition routes and can support use cases such as the user saying &#34;help&#34; or &#34;can I talk to a human?&#34;, which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
     * 
     */
    @Export(name="transitionRoutes", type=List.class, parameters={GoogleCloudDialogflowCxV3beta1TransitionRouteResponse.class})
    private Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse>> transitionRoutes;

    /**
     * @return A flow&#39;s transition routes serve two purposes: * They are responsible for matching the user&#39;s first utterances in the flow. * They are inherited by every page&#39;s transition routes and can support use cases such as the user saying &#34;help&#34; or &#34;can I talk to a human?&#34;, which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow. TransitionRoutes are evalauted in the following order: * TransitionRoutes with intent specified. * TransitionRoutes with only condition specified. TransitionRoutes with intent specified are inherited by pages in the flow.
     * 
     */
    public Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteResponse>> transitionRoutes() {
        return this.transitionRoutes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Flow(String name) {
        this(name, FlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Flow(String name, FlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Flow(String name, FlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Flow", name, args == null ? FlowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Flow(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dialogflow/v3beta1:Flow", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Flow get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Flow(name, id, options);
    }
}
