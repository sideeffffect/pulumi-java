// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ApprovalRuleTemplateAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApprovalRuleTemplateAssociationArgs Empty = new ApprovalRuleTemplateAssociationArgs();

    /**
     * The name for the approval rule template.
     * 
     */
    @Import(name="approvalRuleTemplateName", required=true)
    private Output<String> approvalRuleTemplateName;

    public Output<String> approvalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * The name of the repository that you want to associate with the template.
     * 
     */
    @Import(name="repositoryName", required=true)
    private Output<String> repositoryName;

    public Output<String> repositoryName() {
        return this.repositoryName;
    }

    private ApprovalRuleTemplateAssociationArgs() {}

    private ApprovalRuleTemplateAssociationArgs(ApprovalRuleTemplateAssociationArgs $) {
        this.approvalRuleTemplateName = $.approvalRuleTemplateName;
        this.repositoryName = $.repositoryName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApprovalRuleTemplateAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApprovalRuleTemplateAssociationArgs $;

        public Builder() {
            $ = new ApprovalRuleTemplateAssociationArgs();
        }

        public Builder(ApprovalRuleTemplateAssociationArgs defaults) {
            $ = new ApprovalRuleTemplateAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder approvalRuleTemplateName(Output<String> approvalRuleTemplateName) {
            $.approvalRuleTemplateName = approvalRuleTemplateName;
            return this;
        }

        public Builder approvalRuleTemplateName(String approvalRuleTemplateName) {
            return approvalRuleTemplateName(Output.of(approvalRuleTemplateName));
        }

        public Builder repositoryName(Output<String> repositoryName) {
            $.repositoryName = repositoryName;
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            return repositoryName(Output.of(repositoryName));
        }

        public ApprovalRuleTemplateAssociationArgs build() {
            $.approvalRuleTemplateName = Objects.requireNonNull($.approvalRuleTemplateName, "expected parameter 'approvalRuleTemplateName' to be non-null");
            $.repositoryName = Objects.requireNonNull($.repositoryName, "expected parameter 'repositoryName' to be non-null");
            return $;
        }
    }

}
