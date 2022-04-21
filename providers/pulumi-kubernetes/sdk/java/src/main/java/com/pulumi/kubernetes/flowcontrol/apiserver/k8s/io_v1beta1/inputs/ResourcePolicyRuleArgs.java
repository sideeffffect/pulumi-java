// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ResourcePolicyRule is a predicate that matches some resource requests, testing the request&#39;s verb and the target resource. A ResourcePolicyRule matches a resource request if and only if: (a) at least one member of verbs matches the request, (b) at least one member of apiGroups matches the request, (c) at least one member of resources matches the request, and (d) either (d1) the request does not specify a namespace (i.e., `Namespace==&#34;&#34;`) and clusterScope is true or (d2) the request specifies a namespace and least one member of namespaces matches the request&#39;s namespace.
 * 
 */
public final class ResourcePolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyRuleArgs Empty = new ResourcePolicyRuleArgs();

    /**
     * `apiGroups` is a list of matching API groups and may not be empty. &#34;*&#34; matches all API groups and, if present, must be the only entry. Required.
     * 
     */
    @Import(name="apiGroups", required=true)
    private Output<List<String>> apiGroups;

    public Output<List<String>> apiGroups() {
        return this.apiGroups;
    }

    /**
     * `clusterScope` indicates whether to match requests that do not specify a namespace (which happens either because the resource is not namespaced or the request targets all namespaces). If this field is omitted or false then the `namespaces` field must contain a non-empty list.
     * 
     */
    @Import(name="clusterScope")
    private @Nullable Output<Boolean> clusterScope;

    public Optional<Output<Boolean>> clusterScope() {
        return Optional.ofNullable(this.clusterScope);
    }

    /**
     * `namespaces` is a list of target namespaces that restricts matches.  A request that specifies a target namespace matches only if either (a) this list contains that target namespace or (b) this list contains &#34;*&#34;.  Note that &#34;*&#34; matches any specified namespace but does not match a request that _does not specify_ a namespace (see the `clusterScope` field for that). This list may be empty, but only if `clusterScope` is true.
     * 
     */
    @Import(name="namespaces")
    private @Nullable Output<List<String>> namespaces;

    public Optional<Output<List<String>>> namespaces() {
        return Optional.ofNullable(this.namespaces);
    }

    /**
     * `resources` is a list of matching resources (i.e., lowercase and plural) with, if desired, subresource.  For example, [ &#34;services&#34;, &#34;nodes/status&#34; ].  This list may not be empty. &#34;*&#34; matches all resources and, if present, must be the only entry. Required.
     * 
     */
    @Import(name="resources", required=true)
    private Output<List<String>> resources;

    public Output<List<String>> resources() {
        return this.resources;
    }

    /**
     * `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs and, if present, must be the only entry. Required.
     * 
     */
    @Import(name="verbs", required=true)
    private Output<List<String>> verbs;

    public Output<List<String>> verbs() {
        return this.verbs;
    }

    private ResourcePolicyRuleArgs() {}

    private ResourcePolicyRuleArgs(ResourcePolicyRuleArgs $) {
        this.apiGroups = $.apiGroups;
        this.clusterScope = $.clusterScope;
        this.namespaces = $.namespaces;
        this.resources = $.resources;
        this.verbs = $.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyRuleArgs $;

        public Builder() {
            $ = new ResourcePolicyRuleArgs();
        }

        public Builder(ResourcePolicyRuleArgs defaults) {
            $ = new ResourcePolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiGroups(Output<List<String>> apiGroups) {
            $.apiGroups = apiGroups;
            return this;
        }

        public Builder apiGroups(List<String> apiGroups) {
            return apiGroups(Output.of(apiGroups));
        }

        public Builder apiGroups(String... apiGroups) {
            return apiGroups(List.of(apiGroups));
        }

        public Builder clusterScope(@Nullable Output<Boolean> clusterScope) {
            $.clusterScope = clusterScope;
            return this;
        }

        public Builder clusterScope(Boolean clusterScope) {
            return clusterScope(Output.of(clusterScope));
        }

        public Builder namespaces(@Nullable Output<List<String>> namespaces) {
            $.namespaces = namespaces;
            return this;
        }

        public Builder namespaces(List<String> namespaces) {
            return namespaces(Output.of(namespaces));
        }

        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }

        public Builder resources(Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public Builder verbs(Output<List<String>> verbs) {
            $.verbs = verbs;
            return this;
        }

        public Builder verbs(List<String> verbs) {
            return verbs(Output.of(verbs));
        }

        public Builder verbs(String... verbs) {
            return verbs(List.of(verbs));
        }

        public ResourcePolicyRuleArgs build() {
            $.apiGroups = Objects.requireNonNull($.apiGroups, "expected parameter 'apiGroups' to be non-null");
            $.resources = Objects.requireNonNull($.resources, "expected parameter 'resources' to be non-null");
            $.verbs = Objects.requireNonNull($.verbs, "expected parameter 'verbs' to be non-null");
            return $;
        }
    }

}
