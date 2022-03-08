// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetApprovalRuleTemplateResult {
    /**
     * The ID of the approval rule template.
     * 
     */
    private final String approvalRuleTemplateId;
    /**
     * The content of the approval rule template.
     * 
     */
    private final String content;
    /**
     * The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final String creationDate;
    /**
     * The description of the approval rule template.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    private final String lastModifiedDate;
    /**
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * 
     */
    private final String lastModifiedUser;
    private final String name;
    /**
     * The SHA-256 hash signature for the content of the approval rule template.
     * 
     */
    private final String ruleContentSha256;

    @OutputCustomType.Constructor({"approvalRuleTemplateId","content","creationDate","description","id","lastModifiedDate","lastModifiedUser","name","ruleContentSha256"})
    private GetApprovalRuleTemplateResult(
        String approvalRuleTemplateId,
        String content,
        String creationDate,
        String description,
        String id,
        String lastModifiedDate,
        String lastModifiedUser,
        String name,
        String ruleContentSha256) {
        this.approvalRuleTemplateId = approvalRuleTemplateId;
        this.content = content;
        this.creationDate = creationDate;
        this.description = description;
        this.id = id;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedUser = lastModifiedUser;
        this.name = name;
        this.ruleContentSha256 = ruleContentSha256;
    }

    /**
     * The ID of the approval rule template.
     * 
    */
    public String getApprovalRuleTemplateId() {
        return this.approvalRuleTemplateId;
    }
    /**
     * The content of the approval rule template.
     * 
    */
    public String getContent() {
        return this.content;
    }
    /**
     * The date the approval rule template was created, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The description of the approval rule template.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The date the approval rule template was most recently changed, in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
    */
    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }
    /**
     * The Amazon Resource Name (ARN) of the user who made the most recent changes to the approval rule template.
     * 
    */
    public String getLastModifiedUser() {
        return this.lastModifiedUser;
    }
    public String getName() {
        return this.name;
    }
    /**
     * The SHA-256 hash signature for the content of the approval rule template.
     * 
    */
    public String getRuleContentSha256() {
        return this.ruleContentSha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApprovalRuleTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approvalRuleTemplateId;
        private String content;
        private String creationDate;
        private String description;
        private String id;
        private String lastModifiedDate;
        private String lastModifiedUser;
        private String name;
        private String ruleContentSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApprovalRuleTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRuleTemplateId = defaults.approvalRuleTemplateId;
    	      this.content = defaults.content;
    	      this.creationDate = defaults.creationDate;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastModifiedDate = defaults.lastModifiedDate;
    	      this.lastModifiedUser = defaults.lastModifiedUser;
    	      this.name = defaults.name;
    	      this.ruleContentSha256 = defaults.ruleContentSha256;
        }

        public Builder setApprovalRuleTemplateId(String approvalRuleTemplateId) {
            this.approvalRuleTemplateId = Objects.requireNonNull(approvalRuleTemplateId);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedDate(String lastModifiedDate) {
            this.lastModifiedDate = Objects.requireNonNull(lastModifiedDate);
            return this;
        }

        public Builder setLastModifiedUser(String lastModifiedUser) {
            this.lastModifiedUser = Objects.requireNonNull(lastModifiedUser);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRuleContentSha256(String ruleContentSha256) {
            this.ruleContentSha256 = Objects.requireNonNull(ruleContentSha256);
            return this;
        }
        public GetApprovalRuleTemplateResult build() {
            return new GetApprovalRuleTemplateResult(approvalRuleTemplateId, content, creationDate, description, id, lastModifiedDate, lastModifiedUser, name, ruleContentSha256);
        }
    }
}
