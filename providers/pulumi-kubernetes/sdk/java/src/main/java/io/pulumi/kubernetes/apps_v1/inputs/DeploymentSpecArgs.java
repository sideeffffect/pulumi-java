// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.apps_v1.inputs.DeploymentStrategyArgs;
import io.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DeploymentSpec is the specification of the desired behavior of the Deployment.
 * 
 */
public final class DeploymentSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentSpecArgs Empty = new DeploymentSpecArgs();

    /**
     * Minimum number of seconds for which a newly created pod should be ready without any of its container crashing, for it to be considered available. Defaults to 0 (pod will be considered available as soon as it is ready)
     * 
     */
    @InputImport(name="minReadySeconds")
      private final @Nullable Input<Integer> minReadySeconds;

    public Input<Integer> getMinReadySeconds() {
        return this.minReadySeconds == null ? Input.empty() : this.minReadySeconds;
    }

    /**
     * Indicates that the deployment is paused.
     * 
     */
    @InputImport(name="paused")
      private final @Nullable Input<Boolean> paused;

    public Input<Boolean> getPaused() {
        return this.paused == null ? Input.empty() : this.paused;
    }

    /**
     * The maximum time in seconds for a deployment to make progress before it is considered to be failed. The deployment controller will continue to process failed deployments and a condition with a ProgressDeadlineExceeded reason will be surfaced in the deployment status. Note that progress will not be estimated during the time a deployment is paused. Defaults to 600s.
     * 
     */
    @InputImport(name="progressDeadlineSeconds")
      private final @Nullable Input<Integer> progressDeadlineSeconds;

    public Input<Integer> getProgressDeadlineSeconds() {
        return this.progressDeadlineSeconds == null ? Input.empty() : this.progressDeadlineSeconds;
    }

    /**
     * Number of desired pods. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
     * 
     */
    @InputImport(name="replicas")
      private final @Nullable Input<Integer> replicas;

    public Input<Integer> getReplicas() {
        return this.replicas == null ? Input.empty() : this.replicas;
    }

    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a pointer to distinguish between explicit zero and not specified. Defaults to 10.
     * 
     */
    @InputImport(name="revisionHistoryLimit")
      private final @Nullable Input<Integer> revisionHistoryLimit;

    public Input<Integer> getRevisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Input.empty() : this.revisionHistoryLimit;
    }

    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by this will be the ones affected by this deployment. It must match the pod template's labels.
     * 
     */
    @InputImport(name="selector", required=true)
      private final Input<LabelSelectorArgs> selector;

    public Input<LabelSelectorArgs> getSelector() {
        return this.selector;
    }

    /**
     * The deployment strategy to use to replace existing pods with new ones.
     * 
     */
    @InputImport(name="strategy")
      private final @Nullable Input<DeploymentStrategyArgs> strategy;

    public Input<DeploymentStrategyArgs> getStrategy() {
        return this.strategy == null ? Input.empty() : this.strategy;
    }

    /**
     * Template describes the pods that will be created.
     * 
     */
    @InputImport(name="template", required=true)
      private final Input<PodTemplateSpecArgs> template;

    public Input<PodTemplateSpecArgs> getTemplate() {
        return this.template;
    }

    public DeploymentSpecArgs(
        @Nullable Input<Integer> minReadySeconds,
        @Nullable Input<Boolean> paused,
        @Nullable Input<Integer> progressDeadlineSeconds,
        @Nullable Input<Integer> replicas,
        @Nullable Input<Integer> revisionHistoryLimit,
        Input<LabelSelectorArgs> selector,
        @Nullable Input<DeploymentStrategyArgs> strategy,
        Input<PodTemplateSpecArgs> template) {
        this.minReadySeconds = minReadySeconds;
        this.paused = paused;
        this.progressDeadlineSeconds = progressDeadlineSeconds;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.strategy = strategy;
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
    }

    private DeploymentSpecArgs() {
        this.minReadySeconds = Input.empty();
        this.paused = Input.empty();
        this.progressDeadlineSeconds = Input.empty();
        this.replicas = Input.empty();
        this.revisionHistoryLimit = Input.empty();
        this.selector = Input.empty();
        this.strategy = Input.empty();
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minReadySeconds;
        private @Nullable Input<Boolean> paused;
        private @Nullable Input<Integer> progressDeadlineSeconds;
        private @Nullable Input<Integer> replicas;
        private @Nullable Input<Integer> revisionHistoryLimit;
        private Input<LabelSelectorArgs> selector;
        private @Nullable Input<DeploymentStrategyArgs> strategy;
        private Input<PodTemplateSpecArgs> template;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReadySeconds = defaults.minReadySeconds;
    	      this.paused = defaults.paused;
    	      this.progressDeadlineSeconds = defaults.progressDeadlineSeconds;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.strategy = defaults.strategy;
    	      this.template = defaults.template;
        }

        public Builder minReadySeconds(@Nullable Input<Integer> minReadySeconds) {
            this.minReadySeconds = minReadySeconds;
            return this;
        }

        public Builder minReadySeconds(@Nullable Integer minReadySeconds) {
            this.minReadySeconds = Input.ofNullable(minReadySeconds);
            return this;
        }

        public Builder paused(@Nullable Input<Boolean> paused) {
            this.paused = paused;
            return this;
        }

        public Builder paused(@Nullable Boolean paused) {
            this.paused = Input.ofNullable(paused);
            return this;
        }

        public Builder progressDeadlineSeconds(@Nullable Input<Integer> progressDeadlineSeconds) {
            this.progressDeadlineSeconds = progressDeadlineSeconds;
            return this;
        }

        public Builder progressDeadlineSeconds(@Nullable Integer progressDeadlineSeconds) {
            this.progressDeadlineSeconds = Input.ofNullable(progressDeadlineSeconds);
            return this;
        }

        public Builder replicas(@Nullable Input<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = Input.ofNullable(replicas);
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

        public Builder strategy(@Nullable Input<DeploymentStrategyArgs> strategy) {
            this.strategy = strategy;
            return this;
        }

        public Builder strategy(@Nullable DeploymentStrategyArgs strategy) {
            this.strategy = Input.ofNullable(strategy);
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
        public DeploymentSpecArgs build() {
            return new DeploymentSpecArgs(minReadySeconds, paused, progressDeadlineSeconds, replicas, revisionHistoryLimit, selector, strategy, template);
        }
    }
}
