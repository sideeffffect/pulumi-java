// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApprovalResultResponse {
    /**
     * The time when the approval decision was made.
     * 
     */
    private final String approvalTime;
    /**
     * Email of the user that called the ApproveBuild API to approve or reject a build at the time that the API was called.
     * 
     */
    private final String approverAccount;
    /**
     * Optional. An optional comment for this manual approval result.
     * 
     */
    private final String comment;
    /**
     * The decision of this manual approval.
     * 
     */
    private final String decision;
    /**
     * Optional. An optional URL tied to this manual approval result. This field is essentially the same as comment, except that it will be rendered by the UI differently. An example use case is a link to an external job that approved this Build.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private ApprovalResultResponse(
        @CustomType.Parameter("approvalTime") String approvalTime,
        @CustomType.Parameter("approverAccount") String approverAccount,
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("decision") String decision,
        @CustomType.Parameter("url") String url) {
        this.approvalTime = approvalTime;
        this.approverAccount = approverAccount;
        this.comment = comment;
        this.decision = decision;
        this.url = url;
    }

    /**
     * The time when the approval decision was made.
     * 
    */
    public String approvalTime() {
        return this.approvalTime;
    }
    /**
     * Email of the user that called the ApproveBuild API to approve or reject a build at the time that the API was called.
     * 
    */
    public String approverAccount() {
        return this.approverAccount;
    }
    /**
     * Optional. An optional comment for this manual approval result.
     * 
    */
    public String comment() {
        return this.comment;
    }
    /**
     * The decision of this manual approval.
     * 
    */
    public String decision() {
        return this.decision;
    }
    /**
     * Optional. An optional URL tied to this manual approval result. This field is essentially the same as comment, except that it will be rendered by the UI differently. An example use case is a link to an external job that approved this Build.
     * 
    */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApprovalResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approvalTime;
        private String approverAccount;
        private String comment;
        private String decision;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ApprovalResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalTime = defaults.approvalTime;
    	      this.approverAccount = defaults.approverAccount;
    	      this.comment = defaults.comment;
    	      this.decision = defaults.decision;
    	      this.url = defaults.url;
        }

        public Builder approvalTime(String approvalTime) {
            this.approvalTime = Objects.requireNonNull(approvalTime);
            return this;
        }
        public Builder approverAccount(String approverAccount) {
            this.approverAccount = Objects.requireNonNull(approverAccount);
            return this;
        }
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder decision(String decision) {
            this.decision = Objects.requireNonNull(decision);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public ApprovalResultResponse build() {
            return new ApprovalResultResponse(approvalTime, approverAccount, comment, decision, url);
        }
    }
}
