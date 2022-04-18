// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datalabeling_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration for how human labeling task should be done.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse Empty = new GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse();

    /**
     * Optional. A human-readable description for AnnotatedDataset. The description can be up to 10000 characters long.
     * 
     */
    @Import(name="annotatedDatasetDescription", required=true)
      private final String annotatedDatasetDescription;

    public String annotatedDatasetDescription() {
        return this.annotatedDatasetDescription;
    }

    /**
     * A human-readable name for AnnotatedDataset defined by users. Maximum of 64 characters .
     * 
     */
    @Import(name="annotatedDatasetDisplayName", required=true)
      private final String annotatedDatasetDisplayName;

    public String annotatedDatasetDisplayName() {
        return this.annotatedDatasetDisplayName;
    }

    /**
     * Optional. If you want your own labeling contributors to manage and work on this labeling request, you can set these contributors here. We will give them access to the question types in crowdcompute. Note that these emails must be registered in crowdcompute worker UI: https://crowd-compute.appspot.com/
     * 
     */
    @Import(name="contributorEmails", required=true)
      private final List<String> contributorEmails;

    public List<String> contributorEmails() {
        return this.contributorEmails;
    }

    /**
     * Instruction resource name.
     * 
     */
    @Import(name="instruction", required=true)
      private final String instruction;

    public String instruction() {
        return this.instruction;
    }

    /**
     * Optional. A human-readable label used to logically group labeling tasks. This string must match the regular expression `[a-zA-Z\\d_-]{0,128}`.
     * 
     */
    @Import(name="labelGroup", required=true)
      private final String labelGroup;

    public String labelGroup() {
        return this.labelGroup;
    }

    /**
     * Optional. The Language of this question, as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). Default value is en-US. Only need to set this when task is language related. For example, French text classification.
     * 
     */
    @Import(name="languageCode", required=true)
      private final String languageCode;

    public String languageCode() {
        return this.languageCode;
    }

    /**
     * Optional. Maximum duration for contributors to answer a question. Maximum is 3600 seconds. Default is 3600 seconds.
     * 
     */
    @Import(name="questionDuration", required=true)
      private final String questionDuration;

    public String questionDuration() {
        return this.questionDuration;
    }

    /**
     * Optional. Replication of questions. Each question will be sent to up to this number of contributors to label. Aggregated answers will be returned. Default is set to 1. For image related labeling, valid values are 1, 3, 5.
     * 
     */
    @Import(name="replicaCount", required=true)
      private final Integer replicaCount;

    public Integer replicaCount() {
        return this.replicaCount;
    }

    /**
     * Email of the user who started the labeling task and should be notified by email. If empty no notification will be sent.
     * 
     */
    @Import(name="userEmailAddress", required=true)
      private final String userEmailAddress;

    public String userEmailAddress() {
        return this.userEmailAddress;
    }

    public GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse(
        String annotatedDatasetDescription,
        String annotatedDatasetDisplayName,
        List<String> contributorEmails,
        String instruction,
        String labelGroup,
        String languageCode,
        String questionDuration,
        Integer replicaCount,
        String userEmailAddress) {
        this.annotatedDatasetDescription = Objects.requireNonNull(annotatedDatasetDescription, "expected parameter 'annotatedDatasetDescription' to be non-null");
        this.annotatedDatasetDisplayName = Objects.requireNonNull(annotatedDatasetDisplayName, "expected parameter 'annotatedDatasetDisplayName' to be non-null");
        this.contributorEmails = Objects.requireNonNull(contributorEmails, "expected parameter 'contributorEmails' to be non-null");
        this.instruction = Objects.requireNonNull(instruction, "expected parameter 'instruction' to be non-null");
        this.labelGroup = Objects.requireNonNull(labelGroup, "expected parameter 'labelGroup' to be non-null");
        this.languageCode = Objects.requireNonNull(languageCode, "expected parameter 'languageCode' to be non-null");
        this.questionDuration = Objects.requireNonNull(questionDuration, "expected parameter 'questionDuration' to be non-null");
        this.replicaCount = Objects.requireNonNull(replicaCount, "expected parameter 'replicaCount' to be non-null");
        this.userEmailAddress = Objects.requireNonNull(userEmailAddress, "expected parameter 'userEmailAddress' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse() {
        this.annotatedDatasetDescription = null;
        this.annotatedDatasetDisplayName = null;
        this.contributorEmails = List.of();
        this.instruction = null;
        this.labelGroup = null;
        this.languageCode = null;
        this.questionDuration = null;
        this.replicaCount = null;
        this.userEmailAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String annotatedDatasetDescription;
        private String annotatedDatasetDisplayName;
        private List<String> contributorEmails;
        private String instruction;
        private String labelGroup;
        private String languageCode;
        private String questionDuration;
        private Integer replicaCount;
        private String userEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotatedDatasetDescription = defaults.annotatedDatasetDescription;
    	      this.annotatedDatasetDisplayName = defaults.annotatedDatasetDisplayName;
    	      this.contributorEmails = defaults.contributorEmails;
    	      this.instruction = defaults.instruction;
    	      this.labelGroup = defaults.labelGroup;
    	      this.languageCode = defaults.languageCode;
    	      this.questionDuration = defaults.questionDuration;
    	      this.replicaCount = defaults.replicaCount;
    	      this.userEmailAddress = defaults.userEmailAddress;
        }

        public Builder annotatedDatasetDescription(String annotatedDatasetDescription) {
            this.annotatedDatasetDescription = Objects.requireNonNull(annotatedDatasetDescription);
            return this;
        }
        public Builder annotatedDatasetDisplayName(String annotatedDatasetDisplayName) {
            this.annotatedDatasetDisplayName = Objects.requireNonNull(annotatedDatasetDisplayName);
            return this;
        }
        public Builder contributorEmails(List<String> contributorEmails) {
            this.contributorEmails = Objects.requireNonNull(contributorEmails);
            return this;
        }
        public Builder contributorEmails(String... contributorEmails) {
            return contributorEmails(List.of(contributorEmails));
        }
        public Builder instruction(String instruction) {
            this.instruction = Objects.requireNonNull(instruction);
            return this;
        }
        public Builder labelGroup(String labelGroup) {
            this.labelGroup = Objects.requireNonNull(labelGroup);
            return this;
        }
        public Builder languageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }
        public Builder questionDuration(String questionDuration) {
            this.questionDuration = Objects.requireNonNull(questionDuration);
            return this;
        }
        public Builder replicaCount(Integer replicaCount) {
            this.replicaCount = Objects.requireNonNull(replicaCount);
            return this;
        }
        public Builder userEmailAddress(String userEmailAddress) {
            this.userEmailAddress = Objects.requireNonNull(userEmailAddress);
            return this;
        }        public GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse build() {
            return new GoogleCloudDatalabelingV1beta1HumanAnnotationConfigResponse(annotatedDatasetDescription, annotatedDatasetDisplayName, contributorEmails, instruction, labelGroup, languageCode, questionDuration, replicaCount, userEmailAddress);
        }
    }
}
