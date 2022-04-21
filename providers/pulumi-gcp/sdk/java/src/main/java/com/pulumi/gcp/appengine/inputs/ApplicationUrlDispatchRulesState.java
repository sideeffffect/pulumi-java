// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.appengine.inputs.ApplicationUrlDispatchRulesDispatchRuleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationUrlDispatchRulesState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationUrlDispatchRulesState Empty = new ApplicationUrlDispatchRulesState();

    /**
     * Rules to match an HTTP request and dispatch that request to a service.
     * Structure is documented below.
     * 
     */
    @Import(name="dispatchRules")
    private @Nullable Output<List<ApplicationUrlDispatchRulesDispatchRuleGetArgs>> dispatchRules;

    public Optional<Output<List<ApplicationUrlDispatchRulesDispatchRuleGetArgs>>> dispatchRules() {
        return Optional.ofNullable(this.dispatchRules);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private ApplicationUrlDispatchRulesState() {}

    private ApplicationUrlDispatchRulesState(ApplicationUrlDispatchRulesState $) {
        this.dispatchRules = $.dispatchRules;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationUrlDispatchRulesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationUrlDispatchRulesState $;

        public Builder() {
            $ = new ApplicationUrlDispatchRulesState();
        }

        public Builder(ApplicationUrlDispatchRulesState defaults) {
            $ = new ApplicationUrlDispatchRulesState(Objects.requireNonNull(defaults));
        }

        public Builder dispatchRules(@Nullable Output<List<ApplicationUrlDispatchRulesDispatchRuleGetArgs>> dispatchRules) {
            $.dispatchRules = dispatchRules;
            return this;
        }

        public Builder dispatchRules(List<ApplicationUrlDispatchRulesDispatchRuleGetArgs> dispatchRules) {
            return dispatchRules(Output.of(dispatchRules));
        }

        public Builder dispatchRules(ApplicationUrlDispatchRulesDispatchRuleGetArgs... dispatchRules) {
            return dispatchRules(List.of(dispatchRules));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public ApplicationUrlDispatchRulesState build() {
            return $;
        }
    }

}
