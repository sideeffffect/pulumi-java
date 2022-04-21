// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
 * 
 */
public final class NonResourcePolicyRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NonResourcePolicyRuleArgs Empty = new NonResourcePolicyRuleArgs();

    /**
     * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
     *   - &#34;/healthz&#34; is legal
     *   - &#34;/hea*&#34; is illegal
     *   - &#34;/hea&#34; is legal but matches nothing
     *   - &#34;/hea/*&#34; also matches nothing
     *   - &#34;/healthz/*&#34; matches all per-component health checks.
     *     &#34;*&#34; matches all non-resource urls. if it is present, it must be the only entry. Required.
     * 
     */
    @Import(name="nonResourceURLs", required=true)
    private Output<List<String>> nonResourceURLs;

    public Output<List<String>> nonResourceURLs() {
        return this.nonResourceURLs;
    }

    /**
     * `verbs` is a list of matching verbs and may not be empty. &#34;*&#34; matches all verbs. If it is present, it must be the only entry. Required.
     * 
     */
    @Import(name="verbs", required=true)
    private Output<List<String>> verbs;

    public Output<List<String>> verbs() {
        return this.verbs;
    }

    private NonResourcePolicyRuleArgs() {}

    private NonResourcePolicyRuleArgs(NonResourcePolicyRuleArgs $) {
        this.nonResourceURLs = $.nonResourceURLs;
        this.verbs = $.verbs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NonResourcePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NonResourcePolicyRuleArgs $;

        public Builder() {
            $ = new NonResourcePolicyRuleArgs();
        }

        public Builder(NonResourcePolicyRuleArgs defaults) {
            $ = new NonResourcePolicyRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder nonResourceURLs(Output<List<String>> nonResourceURLs) {
            $.nonResourceURLs = nonResourceURLs;
            return this;
        }

        public Builder nonResourceURLs(List<String> nonResourceURLs) {
            return nonResourceURLs(Output.of(nonResourceURLs));
        }

        public Builder nonResourceURLs(String... nonResourceURLs) {
            return nonResourceURLs(List.of(nonResourceURLs));
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

        public NonResourcePolicyRuleArgs build() {
            $.nonResourceURLs = Objects.requireNonNull($.nonResourceURLs, "expected parameter 'nonResourceURLs' to be non-null");
            $.verbs = Objects.requireNonNull($.verbs, "expected parameter 'verbs' to be non-null");
            return $;
        }
    }

}
