// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstructionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstructionArgs Empty = new GetInstructionArgs();

    @InputImport(name="instructionId", required=true)
      private final String instructionId;

    public String getInstructionId() {
        return this.instructionId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetInstructionArgs(
        String instructionId,
        @Nullable String project) {
        this.instructionId = Objects.requireNonNull(instructionId, "expected parameter 'instructionId' to be non-null");
        this.project = project;
    }

    private GetInstructionArgs() {
        this.instructionId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstructionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instructionId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstructionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instructionId = defaults.instructionId;
    	      this.project = defaults.project;
        }

        public Builder instructionId(String instructionId) {
            this.instructionId = Objects.requireNonNull(instructionId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetInstructionArgs build() {
            return new GetInstructionArgs(instructionId, project);
        }
    }
}
