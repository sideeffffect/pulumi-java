// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApprovalRuleTemplateAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApprovalRuleTemplateAssociationArgs Empty = new ApprovalRuleTemplateAssociationArgs();

    /**
     * The name for the approval rule template.
     * 
     */
    @InputImport(name="approvalRuleTemplateName", required=true)
      private final Input<String> approvalRuleTemplateName;

    public Input<String> getApprovalRuleTemplateName() {
        return this.approvalRuleTemplateName;
    }

    /**
     * The name of the repository that you want to associate with the template.
     * 
     */
    @InputImport(name="repositoryName", required=true)
      private final Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName;
    }

    public ApprovalRuleTemplateAssociationArgs(
        Input<String> approvalRuleTemplateName,
        Input<String> repositoryName) {
        this.approvalRuleTemplateName = Objects.requireNonNull(approvalRuleTemplateName, "expected parameter 'approvalRuleTemplateName' to be non-null");
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
    }

    private ApprovalRuleTemplateAssociationArgs() {
        this.approvalRuleTemplateName = Input.empty();
        this.repositoryName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApprovalRuleTemplateAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> approvalRuleTemplateName;
        private Input<String> repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApprovalRuleTemplateAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRuleTemplateName = defaults.approvalRuleTemplateName;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder approvalRuleTemplateName(Input<String> approvalRuleTemplateName) {
            this.approvalRuleTemplateName = Objects.requireNonNull(approvalRuleTemplateName);
            return this;
        }

        public Builder approvalRuleTemplateName(String approvalRuleTemplateName) {
            this.approvalRuleTemplateName = Input.of(Objects.requireNonNull(approvalRuleTemplateName));
            return this;
        }

        public Builder repositoryName(Input<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Input.of(Objects.requireNonNull(repositoryName));
            return this;
        }
        public ApprovalRuleTemplateAssociationArgs build() {
            return new ApprovalRuleTemplateAssociationArgs(approvalRuleTemplateName, repositoryName);
        }
    }
}
