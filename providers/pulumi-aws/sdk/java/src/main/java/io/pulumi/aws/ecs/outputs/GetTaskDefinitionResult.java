// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTaskDefinitionResult {
    /**
     * The ARN of the task definition
     * 
     */
    private final String arn;
    /**
     * The family of this task definition
     * 
     */
    private final String family;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The Docker networking mode to use for the containers in this task.
     * 
     */
    private final String networkMode;
    /**
     * The revision of this task definition
     * 
     */
    private final Integer revision;
    /**
     * The status of this task definition
     * 
     */
    private final String status;
    private final String taskDefinition;
    /**
     * The ARN of the IAM role that containers in this task can assume
     * 
     */
    private final String taskRoleArn;

    @CustomType.Constructor
    private GetTaskDefinitionResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("family") String family,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("networkMode") String networkMode,
        @CustomType.Parameter("revision") Integer revision,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("taskDefinition") String taskDefinition,
        @CustomType.Parameter("taskRoleArn") String taskRoleArn) {
        this.arn = arn;
        this.family = family;
        this.id = id;
        this.networkMode = networkMode;
        this.revision = revision;
        this.status = status;
        this.taskDefinition = taskDefinition;
        this.taskRoleArn = taskRoleArn;
    }

    /**
     * The ARN of the task definition
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * The family of this task definition
     * 
    */
    public String family() {
        return this.family;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The Docker networking mode to use for the containers in this task.
     * 
    */
    public String networkMode() {
        return this.networkMode;
    }
    /**
     * The revision of this task definition
     * 
    */
    public Integer revision() {
        return this.revision;
    }
    /**
     * The status of this task definition
     * 
    */
    public String status() {
        return this.status;
    }
    public String taskDefinition() {
        return this.taskDefinition;
    }
    /**
     * The ARN of the IAM role that containers in this task can assume
     * 
    */
    public String taskRoleArn() {
        return this.taskRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String family;
        private String id;
        private String networkMode;
        private Integer revision;
        private String status;
        private String taskDefinition;
        private String taskRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.family = defaults.family;
    	      this.id = defaults.id;
    	      this.networkMode = defaults.networkMode;
    	      this.revision = defaults.revision;
    	      this.status = defaults.status;
    	      this.taskDefinition = defaults.taskDefinition;
    	      this.taskRoleArn = defaults.taskRoleArn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder family(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder networkMode(String networkMode) {
            this.networkMode = Objects.requireNonNull(networkMode);
            return this;
        }
        public Builder revision(Integer revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder taskDefinition(String taskDefinition) {
            this.taskDefinition = Objects.requireNonNull(taskDefinition);
            return this;
        }
        public Builder taskRoleArn(String taskRoleArn) {
            this.taskRoleArn = Objects.requireNonNull(taskRoleArn);
            return this;
        }        public GetTaskDefinitionResult build() {
            return new GetTaskDefinitionResult(arn, family, id, networkMode, revision, status, taskDefinition, taskRoleArn);
        }
    }
}
