// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTrialArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTrialArgs Empty = new GetTrialArgs();

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="studyId", required=true)
      private final String studyId;

    public String getStudyId() {
        return this.studyId;
    }

    @InputImport(name="trialId", required=true)
      private final String trialId;

    public String getTrialId() {
        return this.trialId;
    }

    public GetTrialArgs(
        String location,
        @Nullable String project,
        String studyId,
        String trialId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.studyId = Objects.requireNonNull(studyId, "expected parameter 'studyId' to be non-null");
        this.trialId = Objects.requireNonNull(trialId, "expected parameter 'trialId' to be non-null");
    }

    private GetTrialArgs() {
        this.location = null;
        this.project = null;
        this.studyId = null;
        this.trialId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTrialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String studyId;
        private String trialId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTrialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.studyId = defaults.studyId;
    	      this.trialId = defaults.trialId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder studyId(String studyId) {
            this.studyId = Objects.requireNonNull(studyId);
            return this;
        }

        public Builder trialId(String trialId) {
            this.trialId = Objects.requireNonNull(trialId);
            return this;
        }
        public GetTrialArgs build() {
            return new GetTrialArgs(location, project, studyId, trialId);
        }
    }
}
