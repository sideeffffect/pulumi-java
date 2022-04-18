// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apps_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.apps_v1beta2.inputs.StatefulSetUpdateStrategyArgs;
import com.pulumi.kubernetes.core_v1.inputs.PersistentVolumeClaimArgs;
import com.pulumi.kubernetes.core_v1.inputs.PodTemplateSpecArgs;
import com.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A StatefulSetSpec is the specification of a StatefulSet.
 * 
 */
public final class StatefulSetSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulSetSpecArgs Empty = new StatefulSetSpecArgs();

    /**
     * podManagementPolicy controls how pods are created during initial scale up, when replacing pods on nodes, or when scaling down. The default policy is `OrderedReady`, where pods are created in increasing order (pod-0, then pod-1, etc) and the controller will wait until each pod is ready before continuing. When scaling down, the pods are removed in the opposite order. The alternative policy is `Parallel` which will create pods in parallel to match the desired scale without waiting, and on scale down will delete all pods at once.
     * 
     */
    @Import(name="podManagementPolicy")
      private final @Nullable Output<String> podManagementPolicy;

    public Output<String> podManagementPolicy() {
        return this.podManagementPolicy == null ? Codegen.empty() : this.podManagementPolicy;
    }

    /**
     * replicas is the desired number of replicas of the given Template. These are replicas in the sense that they are instantiations of the same Template, but individual replicas also have a consistent identity. If unspecified, defaults to 1.
     * 
     */
    @Import(name="replicas")
      private final @Nullable Output<Integer> replicas;

    public Output<Integer> replicas() {
        return this.replicas == null ? Codegen.empty() : this.replicas;
    }

    /**
     * revisionHistoryLimit is the maximum number of revisions that will be maintained in the StatefulSet's revision history. The revision history consists of all revisions not represented by a currently applied StatefulSetSpec version. The default value is 10.
     * 
     */
    @Import(name="revisionHistoryLimit")
      private final @Nullable Output<Integer> revisionHistoryLimit;

    public Output<Integer> revisionHistoryLimit() {
        return this.revisionHistoryLimit == null ? Codegen.empty() : this.revisionHistoryLimit;
    }

    /**
     * selector is a label query over pods that should match the replica count. It must match the pod template's labels. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
     * 
     */
    @Import(name="selector", required=true)
      private final Output<LabelSelectorArgs> selector;

    public Output<LabelSelectorArgs> selector() {
        return this.selector;
    }

    /**
     * serviceName is the name of the service that governs this StatefulSet. This service must exist before the StatefulSet, and is responsible for the network identity of the set. Pods get DNS/hostnames that follow the pattern: pod-specific-string.serviceName.default.svc.cluster.local where "pod-specific-string" is managed by the StatefulSet controller.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * template is the object that describes the pod that will be created if insufficient replicas are detected. Each pod stamped out by the StatefulSet will fulfill this Template, but have a unique identity from the rest of the StatefulSet.
     * 
     */
    @Import(name="template", required=true)
      private final Output<PodTemplateSpecArgs> template;

    public Output<PodTemplateSpecArgs> template() {
        return this.template;
    }

    /**
     * updateStrategy indicates the StatefulSetUpdateStrategy that will be employed to update Pods in the StatefulSet when a revision is made to Template.
     * 
     */
    @Import(name="updateStrategy")
      private final @Nullable Output<StatefulSetUpdateStrategyArgs> updateStrategy;

    public Output<StatefulSetUpdateStrategyArgs> updateStrategy() {
        return this.updateStrategy == null ? Codegen.empty() : this.updateStrategy;
    }

    /**
     * volumeClaimTemplates is a list of claims that pods are allowed to reference. The StatefulSet controller is responsible for mapping network identities to claims in a way that maintains the identity of a pod. Every claim in this list must have at least one matching (by name) volumeMount in one container in the template. A claim in this list takes precedence over any volumes in the template, with the same name.
     * 
     */
    @Import(name="volumeClaimTemplates")
      private final @Nullable Output<List<PersistentVolumeClaimArgs>> volumeClaimTemplates;

    public Output<List<PersistentVolumeClaimArgs>> volumeClaimTemplates() {
        return this.volumeClaimTemplates == null ? Codegen.empty() : this.volumeClaimTemplates;
    }

    public StatefulSetSpecArgs(
        @Nullable Output<String> podManagementPolicy,
        @Nullable Output<Integer> replicas,
        @Nullable Output<Integer> revisionHistoryLimit,
        Output<LabelSelectorArgs> selector,
        Output<String> serviceName,
        Output<PodTemplateSpecArgs> template,
        @Nullable Output<StatefulSetUpdateStrategyArgs> updateStrategy,
        @Nullable Output<List<PersistentVolumeClaimArgs>> volumeClaimTemplates) {
        this.podManagementPolicy = podManagementPolicy;
        this.replicas = replicas;
        this.revisionHistoryLimit = revisionHistoryLimit;
        this.selector = Objects.requireNonNull(selector, "expected parameter 'selector' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.template = Objects.requireNonNull(template, "expected parameter 'template' to be non-null");
        this.updateStrategy = updateStrategy;
        this.volumeClaimTemplates = volumeClaimTemplates;
    }

    private StatefulSetSpecArgs() {
        this.podManagementPolicy = Codegen.empty();
        this.replicas = Codegen.empty();
        this.revisionHistoryLimit = Codegen.empty();
        this.selector = Codegen.empty();
        this.serviceName = Codegen.empty();
        this.template = Codegen.empty();
        this.updateStrategy = Codegen.empty();
        this.volumeClaimTemplates = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatefulSetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> podManagementPolicy;
        private @Nullable Output<Integer> replicas;
        private @Nullable Output<Integer> revisionHistoryLimit;
        private Output<LabelSelectorArgs> selector;
        private Output<String> serviceName;
        private Output<PodTemplateSpecArgs> template;
        private @Nullable Output<StatefulSetUpdateStrategyArgs> updateStrategy;
        private @Nullable Output<List<PersistentVolumeClaimArgs>> volumeClaimTemplates;

        public Builder() {
    	      // Empty
        }

        public Builder(StatefulSetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podManagementPolicy = defaults.podManagementPolicy;
    	      this.replicas = defaults.replicas;
    	      this.revisionHistoryLimit = defaults.revisionHistoryLimit;
    	      this.selector = defaults.selector;
    	      this.serviceName = defaults.serviceName;
    	      this.template = defaults.template;
    	      this.updateStrategy = defaults.updateStrategy;
    	      this.volumeClaimTemplates = defaults.volumeClaimTemplates;
        }

        public Builder podManagementPolicy(@Nullable Output<String> podManagementPolicy) {
            this.podManagementPolicy = podManagementPolicy;
            return this;
        }
        public Builder podManagementPolicy(@Nullable String podManagementPolicy) {
            this.podManagementPolicy = Codegen.ofNullable(podManagementPolicy);
            return this;
        }
        public Builder replicas(@Nullable Output<Integer> replicas) {
            this.replicas = replicas;
            return this;
        }
        public Builder replicas(@Nullable Integer replicas) {
            this.replicas = Codegen.ofNullable(replicas);
            return this;
        }
        public Builder revisionHistoryLimit(@Nullable Output<Integer> revisionHistoryLimit) {
            this.revisionHistoryLimit = revisionHistoryLimit;
            return this;
        }
        public Builder revisionHistoryLimit(@Nullable Integer revisionHistoryLimit) {
            this.revisionHistoryLimit = Codegen.ofNullable(revisionHistoryLimit);
            return this;
        }
        public Builder selector(Output<LabelSelectorArgs> selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public Builder selector(LabelSelectorArgs selector) {
            this.selector = Output.of(Objects.requireNonNull(selector));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder template(Output<PodTemplateSpecArgs> template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder template(PodTemplateSpecArgs template) {
            this.template = Output.of(Objects.requireNonNull(template));
            return this;
        }
        public Builder updateStrategy(@Nullable Output<StatefulSetUpdateStrategyArgs> updateStrategy) {
            this.updateStrategy = updateStrategy;
            return this;
        }
        public Builder updateStrategy(@Nullable StatefulSetUpdateStrategyArgs updateStrategy) {
            this.updateStrategy = Codegen.ofNullable(updateStrategy);
            return this;
        }
        public Builder volumeClaimTemplates(@Nullable Output<List<PersistentVolumeClaimArgs>> volumeClaimTemplates) {
            this.volumeClaimTemplates = volumeClaimTemplates;
            return this;
        }
        public Builder volumeClaimTemplates(@Nullable List<PersistentVolumeClaimArgs> volumeClaimTemplates) {
            this.volumeClaimTemplates = Codegen.ofNullable(volumeClaimTemplates);
            return this;
        }
        public Builder volumeClaimTemplates(PersistentVolumeClaimArgs... volumeClaimTemplates) {
            return volumeClaimTemplates(List.of(volumeClaimTemplates));
        }        public StatefulSetSpecArgs build() {
            return new StatefulSetSpecArgs(podManagementPolicy, replicas, revisionHistoryLimit, selector, serviceName, template, updateStrategy, volumeClaimTemplates);
        }
    }
}
