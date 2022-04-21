// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudasset_v1.inputs.AccessSelectorResponse;
import com.pulumi.googlenative.cloudasset_v1.inputs.ConditionContextResponse;
import com.pulumi.googlenative.cloudasset_v1.inputs.IdentitySelectorResponse;
import com.pulumi.googlenative.cloudasset_v1.inputs.OptionsResponse;
import com.pulumi.googlenative.cloudasset_v1.inputs.ResourceSelectorResponse;
import java.lang.String;
import java.util.Objects;


/**
 * IAM policy analysis query message.
 * 
 */
public final class IamPolicyAnalysisQueryResponse extends com.pulumi.resources.InvokeArgs {

    public static final IamPolicyAnalysisQueryResponse Empty = new IamPolicyAnalysisQueryResponse();

    /**
     * Optional. Specifies roles or permissions for analysis. This is optional.
     * 
     */
    @Import(name="accessSelector", required=true)
    private AccessSelectorResponse accessSelector;

    public AccessSelectorResponse accessSelector() {
        return this.accessSelector;
    }

    /**
     * Optional. The hypothetical context for IAM conditions evaluation.
     * 
     */
    @Import(name="conditionContext", required=true)
    private ConditionContextResponse conditionContext;

    public ConditionContextResponse conditionContext() {
        return this.conditionContext;
    }

    /**
     * Optional. Specifies an identity for analysis.
     * 
     */
    @Import(name="identitySelector", required=true)
    private IdentitySelectorResponse identitySelector;

    public IdentitySelectorResponse identitySelector() {
        return this.identitySelector;
    }

    /**
     * Optional. The query options.
     * 
     */
    @Import(name="options", required=true)
    private OptionsResponse options;

    public OptionsResponse options() {
        return this.options;
    }

    /**
     * Optional. Specifies a resource for analysis.
     * 
     */
    @Import(name="resourceSelector", required=true)
    private ResourceSelectorResponse resourceSelector;

    public ResourceSelectorResponse resourceSelector() {
        return this.resourceSelector;
    }

    /**
     * The relative name of the root asset. Only resources and IAM policies within the scope will be analyzed. This can only be an organization number (such as &#34;organizations/123&#34;), a folder number (such as &#34;folders/123&#34;), a project ID (such as &#34;projects/my-project-id&#34;), or a project number (such as &#34;projects/12345&#34;). To know how to get organization id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id). To know how to get folder or project id, visit [here ](https://cloud.google.com/resource-manager/docs/creating-managing-folders#viewing_or_listing_folders_and_projects).
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    public String scope() {
        return this.scope;
    }

    private IamPolicyAnalysisQueryResponse() {}

    private IamPolicyAnalysisQueryResponse(IamPolicyAnalysisQueryResponse $) {
        this.accessSelector = $.accessSelector;
        this.conditionContext = $.conditionContext;
        this.identitySelector = $.identitySelector;
        this.options = $.options;
        this.resourceSelector = $.resourceSelector;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamPolicyAnalysisQueryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamPolicyAnalysisQueryResponse $;

        public Builder() {
            $ = new IamPolicyAnalysisQueryResponse();
        }

        public Builder(IamPolicyAnalysisQueryResponse defaults) {
            $ = new IamPolicyAnalysisQueryResponse(Objects.requireNonNull(defaults));
        }

        public Builder accessSelector(AccessSelectorResponse accessSelector) {
            $.accessSelector = accessSelector;
            return this;
        }

        public Builder conditionContext(ConditionContextResponse conditionContext) {
            $.conditionContext = conditionContext;
            return this;
        }

        public Builder identitySelector(IdentitySelectorResponse identitySelector) {
            $.identitySelector = identitySelector;
            return this;
        }

        public Builder options(OptionsResponse options) {
            $.options = options;
            return this;
        }

        public Builder resourceSelector(ResourceSelectorResponse resourceSelector) {
            $.resourceSelector = resourceSelector;
            return this;
        }

        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public IamPolicyAnalysisQueryResponse build() {
            $.accessSelector = Objects.requireNonNull($.accessSelector, "expected parameter 'accessSelector' to be non-null");
            $.conditionContext = Objects.requireNonNull($.conditionContext, "expected parameter 'conditionContext' to be non-null");
            $.identitySelector = Objects.requireNonNull($.identitySelector, "expected parameter 'identitySelector' to be non-null");
            $.options = Objects.requireNonNull($.options, "expected parameter 'options' to be non-null");
            $.resourceSelector = Objects.requireNonNull($.resourceSelector, "expected parameter 'resourceSelector' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
