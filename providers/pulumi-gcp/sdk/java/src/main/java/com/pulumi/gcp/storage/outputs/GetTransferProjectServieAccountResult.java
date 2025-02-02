// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransferProjectServieAccountResult {
    /**
     * @return Email address of the default service account used by Storage Transfer Jobs running in this project.
     * 
     */
    private final String email;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String project;
    /**
     * @return Unique identifier for the service account.
     * 
     */
    private final String subjectId;

    @CustomType.Constructor
    private GetTransferProjectServieAccountResult(
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("subjectId") String subjectId) {
        this.email = email;
        this.id = id;
        this.project = project;
        this.subjectId = subjectId;
    }

    /**
     * @return Email address of the default service account used by Storage Transfer Jobs running in this project.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String project() {
        return this.project;
    }
    /**
     * @return Unique identifier for the service account.
     * 
     */
    public String subjectId() {
        return this.subjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransferProjectServieAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;
        private String id;
        private String project;
        private String subjectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransferProjectServieAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.project = defaults.project;
    	      this.subjectId = defaults.subjectId;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder subjectId(String subjectId) {
            this.subjectId = Objects.requireNonNull(subjectId);
            return this;
        }        public GetTransferProjectServieAccountResult build() {
            return new GetTransferProjectServieAccountResult(email, id, project, subjectId);
        }
    }
}
