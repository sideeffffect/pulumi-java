// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.diagflow.inputs.CxPageEntryFulfillmentArgs;
import io.pulumi.gcp.diagflow.inputs.CxPageEventHandlerArgs;
import io.pulumi.gcp.diagflow.inputs.CxPageFormArgs;
import io.pulumi.gcp.diagflow.inputs.CxPageTransitionRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageArgs Empty = new CxPageArgs();

    /**
     * The human-readable name of the parameter, unique within the form.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The fulfillment to call when the session is entering the page.
     * Structure is documented below.
     * 
     */
    @InputImport(name="entryFulfillment")
      private final @Nullable Input<CxPageEntryFulfillmentArgs> entryFulfillment;

    public Input<CxPageEntryFulfillmentArgs> getEntryFulfillment() {
        return this.entryFulfillment == null ? Input.empty() : this.entryFulfillment;
    }

    /**
     * Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * Structure is documented below.
     * 
     */
    @InputImport(name="eventHandlers")
      private final @Nullable Input<List<CxPageEventHandlerArgs>> eventHandlers;

    public Input<List<CxPageEventHandlerArgs>> getEventHandlers() {
        return this.eventHandlers == null ? Input.empty() : this.eventHandlers;
    }

    /**
     * The form associated with the page, used for collecting parameters relevant to the page.
     * Structure is documented below.
     * 
     */
    @InputImport(name="form")
      private final @Nullable Input<CxPageFormArgs> form;

    public Input<CxPageFormArgs> getForm() {
        return this.form == null ? Input.empty() : this.form;
    }

    /**
     * The language of the following fields in page:
     * Page.entry_fulfillment.messages
     * Page.entry_fulfillment.conditional_cases
     * Page.event_handlers.trigger_fulfillment.messages
     * Page.event_handlers.trigger_fulfillment.conditional_cases
     * Page.form.parameters.fill_behavior.initial_prompt_fulfillment.messages
     * Page.form.parameters.fill_behavior.initial_prompt_fulfillment.conditional_cases
     * Page.form.parameters.fill_behavior.reprompt_event_handlers.messages
     * Page.form.parameters.fill_behavior.reprompt_event_handlers.conditional_cases
     * Page.transition_routes.trigger_fulfillment.messages
     * Page.transition_routes.trigger_fulfillment.conditional_cases
     * If not specified, the agent's default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @InputImport(name="languageCode")
      private final @Nullable Input<String> languageCode;

    public Input<String> getLanguageCode() {
        return this.languageCode == null ? Input.empty() : this.languageCode;
    }

    /**
     * The flow to create a page for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * Ordered list of TransitionRouteGroups associated with the page. Transition route groups must be unique within a page.
     * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page's transition route > page's transition route group > flow's transition routes.
     * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence.
     * Format:projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>/transitionRouteGroups/<TransitionRouteGroup ID>.
     * 
     */
    @InputImport(name="transitionRouteGroups")
      private final @Nullable Input<List<String>> transitionRouteGroups;

    public Input<List<String>> getTransitionRouteGroups() {
        return this.transitionRouteGroups == null ? Input.empty() : this.transitionRouteGroups;
    }

    /**
     * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow.
     * When we are in a certain page, the TransitionRoutes are evalauted in the following order:
     * TransitionRoutes defined in the page with intent specified.
     * TransitionRoutes defined in the transition route groups with intent specified.
     * TransitionRoutes defined in flow with intent specified.
     * TransitionRoutes defined in the transition route groups with intent specified.
     * TransitionRoutes defined in the page with only condition specified.
     * TransitionRoutes defined in the transition route groups with only condition specified.
     * Structure is documented below.
     * 
     */
    @InputImport(name="transitionRoutes")
      private final @Nullable Input<List<CxPageTransitionRouteArgs>> transitionRoutes;

    public Input<List<CxPageTransitionRouteArgs>> getTransitionRoutes() {
        return this.transitionRoutes == null ? Input.empty() : this.transitionRoutes;
    }

    public CxPageArgs(
        Input<String> displayName,
        @Nullable Input<CxPageEntryFulfillmentArgs> entryFulfillment,
        @Nullable Input<List<CxPageEventHandlerArgs>> eventHandlers,
        @Nullable Input<CxPageFormArgs> form,
        @Nullable Input<String> languageCode,
        @Nullable Input<String> parent,
        @Nullable Input<List<String>> transitionRouteGroups,
        @Nullable Input<List<CxPageTransitionRouteArgs>> transitionRoutes) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.entryFulfillment = entryFulfillment;
        this.eventHandlers = eventHandlers;
        this.form = form;
        this.languageCode = languageCode;
        this.parent = parent;
        this.transitionRouteGroups = transitionRouteGroups;
        this.transitionRoutes = transitionRoutes;
    }

    private CxPageArgs() {
        this.displayName = Input.empty();
        this.entryFulfillment = Input.empty();
        this.eventHandlers = Input.empty();
        this.form = Input.empty();
        this.languageCode = Input.empty();
        this.parent = Input.empty();
        this.transitionRouteGroups = Input.empty();
        this.transitionRoutes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> displayName;
        private @Nullable Input<CxPageEntryFulfillmentArgs> entryFulfillment;
        private @Nullable Input<List<CxPageEventHandlerArgs>> eventHandlers;
        private @Nullable Input<CxPageFormArgs> form;
        private @Nullable Input<String> languageCode;
        private @Nullable Input<String> parent;
        private @Nullable Input<List<String>> transitionRouteGroups;
        private @Nullable Input<List<CxPageTransitionRouteArgs>> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entryFulfillment = defaults.entryFulfillment;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.form = defaults.form;
    	      this.languageCode = defaults.languageCode;
    	      this.parent = defaults.parent;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder displayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder entryFulfillment(@Nullable Input<CxPageEntryFulfillmentArgs> entryFulfillment) {
            this.entryFulfillment = entryFulfillment;
            return this;
        }

        public Builder entryFulfillment(@Nullable CxPageEntryFulfillmentArgs entryFulfillment) {
            this.entryFulfillment = Input.ofNullable(entryFulfillment);
            return this;
        }

        public Builder eventHandlers(@Nullable Input<List<CxPageEventHandlerArgs>> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }

        public Builder eventHandlers(@Nullable List<CxPageEventHandlerArgs> eventHandlers) {
            this.eventHandlers = Input.ofNullable(eventHandlers);
            return this;
        }

        public Builder form(@Nullable Input<CxPageFormArgs> form) {
            this.form = form;
            return this;
        }

        public Builder form(@Nullable CxPageFormArgs form) {
            this.form = Input.ofNullable(form);
            return this;
        }

        public Builder languageCode(@Nullable Input<String> languageCode) {
            this.languageCode = languageCode;
            return this;
        }

        public Builder languageCode(@Nullable String languageCode) {
            this.languageCode = Input.ofNullable(languageCode);
            return this;
        }

        public Builder parent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder parent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder transitionRouteGroups(@Nullable Input<List<String>> transitionRouteGroups) {
            this.transitionRouteGroups = transitionRouteGroups;
            return this;
        }

        public Builder transitionRouteGroups(@Nullable List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Input.ofNullable(transitionRouteGroups);
            return this;
        }

        public Builder transitionRoutes(@Nullable Input<List<CxPageTransitionRouteArgs>> transitionRoutes) {
            this.transitionRoutes = transitionRoutes;
            return this;
        }

        public Builder transitionRoutes(@Nullable List<CxPageTransitionRouteArgs> transitionRoutes) {
            this.transitionRoutes = Input.ofNullable(transitionRoutes);
            return this;
        }
        public CxPageArgs build() {
            return new CxPageArgs(displayName, entryFulfillment, eventHandlers, form, languageCode, parent, transitionRouteGroups, transitionRoutes);
        }
    }
}
