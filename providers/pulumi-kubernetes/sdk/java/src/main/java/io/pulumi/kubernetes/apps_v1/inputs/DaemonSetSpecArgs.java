// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1.inputs.DaemonSetUpdateStrategyArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DaemonSetSpec is the specification of a daemon set.
 * 
 */
public final class DaemonSetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonSetSpecArgs Empty = new DaemonSetSpecArgs();

    /**
     * The minimum number of seconds for which a newly created DaemonSet pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready).
     * 
     */
    @InputImport(name="minReadySeconds")
      private final @Nullable Input<Integer> minReadySeconds;

    public Input<Integer> getMinReadySeconds() {
        return this.minReadySeconds == null ? Input.empty() : this.minReadySeconds;
    }

    /**
     * The number of old history to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    @InputImport(name="revisionHistoryLimit")
      private final @Nullable Input<Integer> revisionHistoryLimit;

    public Input<Integer> getRevisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Input.empty() : this.revisionHistoryLimit;
    }

    /**
     * A label query over pods that are managed by the daemon set. Must match in order to be controlled. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @InputImport(name="selector", required=true)
      private final Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector;
    }

    /**
     * An object that describes the pod that will be created. The DaemonSet will create exactly one copy of this pod on every node that matches the template's node selector (or on every node if no node selector is specified). More info: https://kubernetes.io/docs/concepts/workloads/controllers/replicationcontroller#pod-template
     * 
     */
    @InputImport(name="template", required=true)
      private final Input<PodTemplateSpecArgs> template;

    public Input<PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    /**
     * An update strategy to replace existing DaemonSet pods with new pods.
     * 
     */
    @InputImport(name="updateStrategy")
      private final @Nullable Input<DaemonSetUpdateStrategyArgs> updateStrategy;

    public Input<DaemonSetUpdateStrategyArgs> getUpdateStrategy() {
        return this.updateStrategy == null ? Input.empty() : this.updateStrategy;
    }

    public DaemonSetSpecArgs(
        @Nullable Input<Integer> minReadySeconds,
        @Nullable Input<Integer> revisionHistoryLimit,
        Input<LabelSelectorArgs> selector,
        Input<PodTemplateSpecArgs> template,
        @Nullable Input<DaemonSetUpdateStrategyArgs> updateStrategy) {
        this.minReadySeconds = minReadySeconds;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.updateStrategy = updateStrategy;
    }

    private DaemonSetSpecArgs() {
        this.minReadySeconds = Input.empty();
        this.revisionHistoryLimit = Input.empty();
        this.selector = Input.empty();
        this.template = Input.empty();
        this.updateStrategy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minReadySeconds;
        private @Nullable Input<Integer> revisionHistoryLimit;
        private Input<LabelSelectorArgs> selector;
        private Input<PodTemplateSpecArgs> template;
        private @Nullable Input<DaemonSetUpdateStrategyArgs> updateStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.template = defaults.template;
    	      this.updateStrategy = defaults.updateStrategy;
        }

        public Builder minReadySeconds(@Nullable Input<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Input.ofNullable(minReadySeconds);
            return this;
        }

        public Builder revisionHistoryLimit(@Nullable Input<Integer> revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }

        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = Input.ofNullable(revisionHistoryLimit);
            return this;
        }

        public Builder selector(Input<LabelSelectorArgs> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }

        public Builder selector(LabelSelectorArgs selector) {
            this.selector = Input.of(Objects.requireNonNull(selector));
            return this;
        }

        public Builder template(Input<PodTemplateSpecArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }

        public Builder template(PodTemplateSpecArgs template) {
            this.template = Input.of(Objects.requireNonNull(template));
            return this;
        }

        public Builder updateStrategy(@Nullable Input<DaemonSetUpdateStrategyArgs> updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }

        public Builder updateStrategy(@Nullable DaemonSetUpdateStrategyArgs updateStrategy) {
            this.updateStrategy = Input.ofNullable(updateStrategy);
            return this;
        }
        public DaemonSetSpecArgs build() {
            return new DaemonSetSpecArgs(minReadySeconds, revisionHistoryLimit, selector, template, updateStrategy);
        }
    }
}
