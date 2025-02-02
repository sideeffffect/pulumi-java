// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkebackup_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gkebackup_v1.inputs.GroupKindArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A transformation rule to be applied against Kubernetes resources as they are selected for restoration from a Backup. A rule contains both filtering logic (which resources are subject to substitution) and substitution logic.
 * 
 */
public final class SubstitutionRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubstitutionRuleArgs Empty = new SubstitutionRuleArgs();

    /**
     * This is the new value to set for any fields that pass the filtering and selection criteria. To remove a value from a Kubernetes resource, either leave this field unspecified, or set it to the empty string (&#34;&#34;).
     * 
     */
    @Import(name="newValue")
    private @Nullable Output<String> newValue;

    /**
     * @return This is the new value to set for any fields that pass the filtering and selection criteria. To remove a value from a Kubernetes resource, either leave this field unspecified, or set it to the empty string (&#34;&#34;).
     * 
     */
    public Optional<Output<String>> newValue() {
        return Optional.ofNullable(this.newValue);
    }

    /**
     * (Filtering parameter) This is a [regular expression] (https://en.wikipedia.org/wiki/Regular_expression) that is compared against the fields matched by the target_json_path expression (and must also have passed the previous filters). Substitution will not be performed against fields whose value does not match this expression. If this field is NOT specified, then ALL fields matched by the target_json_path expression will undergo substitution. Note that an empty (e.g., &#34;&#34;, rather than unspecified) value for for this field will only match empty fields.
     * 
     */
    @Import(name="originalValuePattern")
    private @Nullable Output<String> originalValuePattern;

    /**
     * @return (Filtering parameter) This is a [regular expression] (https://en.wikipedia.org/wiki/Regular_expression) that is compared against the fields matched by the target_json_path expression (and must also have passed the previous filters). Substitution will not be performed against fields whose value does not match this expression. If this field is NOT specified, then ALL fields matched by the target_json_path expression will undergo substitution. Note that an empty (e.g., &#34;&#34;, rather than unspecified) value for for this field will only match empty fields.
     * 
     */
    public Optional<Output<String>> originalValuePattern() {
        return Optional.ofNullable(this.originalValuePattern);
    }

    /**
     * (Filtering parameter) Any resource subject to substitution must belong to one of the listed &#34;types&#34;. If this field is not provided, no type filtering will be performed (all resources of all types matching previous filtering parameters will be candidates for substitution).
     * 
     */
    @Import(name="targetGroupKinds")
    private @Nullable Output<List<GroupKindArgs>> targetGroupKinds;

    /**
     * @return (Filtering parameter) Any resource subject to substitution must belong to one of the listed &#34;types&#34;. If this field is not provided, no type filtering will be performed (all resources of all types matching previous filtering parameters will be candidates for substitution).
     * 
     */
    public Optional<Output<List<GroupKindArgs>>> targetGroupKinds() {
        return Optional.ofNullable(this.targetGroupKinds);
    }

    /**
     * This is a [JSONPath] (https://kubernetes.io/docs/reference/kubectl/jsonpath/) expression that matches specific fields of candidate resources and it operates as both a filtering parameter (resources that are not matched with this expression will not be candidates for substitution) as well as a field identifier (identifies exactly which fields out of the candidate resources will be modified).
     * 
     */
    @Import(name="targetJsonPath", required=true)
    private Output<String> targetJsonPath;

    /**
     * @return This is a [JSONPath] (https://kubernetes.io/docs/reference/kubectl/jsonpath/) expression that matches specific fields of candidate resources and it operates as both a filtering parameter (resources that are not matched with this expression will not be candidates for substitution) as well as a field identifier (identifies exactly which fields out of the candidate resources will be modified).
     * 
     */
    public Output<String> targetJsonPath() {
        return this.targetJsonPath;
    }

    /**
     * (Filtering parameter) Any resource subject to substitution must be contained within one of the listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace filtering will be performed (all resources in all Namespaces, including all cluster-scoped resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources in the same rule, use an empty string (&#34;&#34;) as one of the target namespaces.
     * 
     */
    @Import(name="targetNamespaces")
    private @Nullable Output<List<String>> targetNamespaces;

    /**
     * @return (Filtering parameter) Any resource subject to substitution must be contained within one of the listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace filtering will be performed (all resources in all Namespaces, including all cluster-scoped resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources in the same rule, use an empty string (&#34;&#34;) as one of the target namespaces.
     * 
     */
    public Optional<Output<List<String>>> targetNamespaces() {
        return Optional.ofNullable(this.targetNamespaces);
    }

    private SubstitutionRuleArgs() {}

    private SubstitutionRuleArgs(SubstitutionRuleArgs $) {
        this.newValue = $.newValue;
        this.originalValuePattern = $.originalValuePattern;
        this.targetGroupKinds = $.targetGroupKinds;
        this.targetJsonPath = $.targetJsonPath;
        this.targetNamespaces = $.targetNamespaces;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubstitutionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubstitutionRuleArgs $;

        public Builder() {
            $ = new SubstitutionRuleArgs();
        }

        public Builder(SubstitutionRuleArgs defaults) {
            $ = new SubstitutionRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param newValue This is the new value to set for any fields that pass the filtering and selection criteria. To remove a value from a Kubernetes resource, either leave this field unspecified, or set it to the empty string (&#34;&#34;).
         * 
         * @return builder
         * 
         */
        public Builder newValue(@Nullable Output<String> newValue) {
            $.newValue = newValue;
            return this;
        }

        /**
         * @param newValue This is the new value to set for any fields that pass the filtering and selection criteria. To remove a value from a Kubernetes resource, either leave this field unspecified, or set it to the empty string (&#34;&#34;).
         * 
         * @return builder
         * 
         */
        public Builder newValue(String newValue) {
            return newValue(Output.of(newValue));
        }

        /**
         * @param originalValuePattern (Filtering parameter) This is a [regular expression] (https://en.wikipedia.org/wiki/Regular_expression) that is compared against the fields matched by the target_json_path expression (and must also have passed the previous filters). Substitution will not be performed against fields whose value does not match this expression. If this field is NOT specified, then ALL fields matched by the target_json_path expression will undergo substitution. Note that an empty (e.g., &#34;&#34;, rather than unspecified) value for for this field will only match empty fields.
         * 
         * @return builder
         * 
         */
        public Builder originalValuePattern(@Nullable Output<String> originalValuePattern) {
            $.originalValuePattern = originalValuePattern;
            return this;
        }

        /**
         * @param originalValuePattern (Filtering parameter) This is a [regular expression] (https://en.wikipedia.org/wiki/Regular_expression) that is compared against the fields matched by the target_json_path expression (and must also have passed the previous filters). Substitution will not be performed against fields whose value does not match this expression. If this field is NOT specified, then ALL fields matched by the target_json_path expression will undergo substitution. Note that an empty (e.g., &#34;&#34;, rather than unspecified) value for for this field will only match empty fields.
         * 
         * @return builder
         * 
         */
        public Builder originalValuePattern(String originalValuePattern) {
            return originalValuePattern(Output.of(originalValuePattern));
        }

        /**
         * @param targetGroupKinds (Filtering parameter) Any resource subject to substitution must belong to one of the listed &#34;types&#34;. If this field is not provided, no type filtering will be performed (all resources of all types matching previous filtering parameters will be candidates for substitution).
         * 
         * @return builder
         * 
         */
        public Builder targetGroupKinds(@Nullable Output<List<GroupKindArgs>> targetGroupKinds) {
            $.targetGroupKinds = targetGroupKinds;
            return this;
        }

        /**
         * @param targetGroupKinds (Filtering parameter) Any resource subject to substitution must belong to one of the listed &#34;types&#34;. If this field is not provided, no type filtering will be performed (all resources of all types matching previous filtering parameters will be candidates for substitution).
         * 
         * @return builder
         * 
         */
        public Builder targetGroupKinds(List<GroupKindArgs> targetGroupKinds) {
            return targetGroupKinds(Output.of(targetGroupKinds));
        }

        /**
         * @param targetGroupKinds (Filtering parameter) Any resource subject to substitution must belong to one of the listed &#34;types&#34;. If this field is not provided, no type filtering will be performed (all resources of all types matching previous filtering parameters will be candidates for substitution).
         * 
         * @return builder
         * 
         */
        public Builder targetGroupKinds(GroupKindArgs... targetGroupKinds) {
            return targetGroupKinds(List.of(targetGroupKinds));
        }

        /**
         * @param targetJsonPath This is a [JSONPath] (https://kubernetes.io/docs/reference/kubectl/jsonpath/) expression that matches specific fields of candidate resources and it operates as both a filtering parameter (resources that are not matched with this expression will not be candidates for substitution) as well as a field identifier (identifies exactly which fields out of the candidate resources will be modified).
         * 
         * @return builder
         * 
         */
        public Builder targetJsonPath(Output<String> targetJsonPath) {
            $.targetJsonPath = targetJsonPath;
            return this;
        }

        /**
         * @param targetJsonPath This is a [JSONPath] (https://kubernetes.io/docs/reference/kubectl/jsonpath/) expression that matches specific fields of candidate resources and it operates as both a filtering parameter (resources that are not matched with this expression will not be candidates for substitution) as well as a field identifier (identifies exactly which fields out of the candidate resources will be modified).
         * 
         * @return builder
         * 
         */
        public Builder targetJsonPath(String targetJsonPath) {
            return targetJsonPath(Output.of(targetJsonPath));
        }

        /**
         * @param targetNamespaces (Filtering parameter) Any resource subject to substitution must be contained within one of the listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace filtering will be performed (all resources in all Namespaces, including all cluster-scoped resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources in the same rule, use an empty string (&#34;&#34;) as one of the target namespaces.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespaces(@Nullable Output<List<String>> targetNamespaces) {
            $.targetNamespaces = targetNamespaces;
            return this;
        }

        /**
         * @param targetNamespaces (Filtering parameter) Any resource subject to substitution must be contained within one of the listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace filtering will be performed (all resources in all Namespaces, including all cluster-scoped resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources in the same rule, use an empty string (&#34;&#34;) as one of the target namespaces.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespaces(List<String> targetNamespaces) {
            return targetNamespaces(Output.of(targetNamespaces));
        }

        /**
         * @param targetNamespaces (Filtering parameter) Any resource subject to substitution must be contained within one of the listed Kubernetes Namespace in the Backup. If this field is not provided, no namespace filtering will be performed (all resources in all Namespaces, including all cluster-scoped resources, will be candidates for substitution). To mix cluster-scoped and namespaced resources in the same rule, use an empty string (&#34;&#34;) as one of the target namespaces.
         * 
         * @return builder
         * 
         */
        public Builder targetNamespaces(String... targetNamespaces) {
            return targetNamespaces(List.of(targetNamespaces));
        }

        public SubstitutionRuleArgs build() {
            $.targetJsonPath = Objects.requireNonNull($.targetJsonPath, "expected parameter 'targetJsonPath' to be non-null");
            return $;
        }
    }

}
