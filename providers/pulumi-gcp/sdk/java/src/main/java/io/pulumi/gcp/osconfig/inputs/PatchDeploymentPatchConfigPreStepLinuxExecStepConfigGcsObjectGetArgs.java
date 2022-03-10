// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs Empty = new PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    @InputImport(name="generationNumber", required=true)
      private final Input<String> generationNumber;

    public Input<String> getGenerationNumber() {
        return this.generationNumber;
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @InputImport(name="object", required=true)
      private final Input<String> object;

    public Input<String> getObject() {
        return this.object;
    }

    public PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs(
        Input<String> bucket,
        Input<String> generationNumber,
        Input<String> object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generationNumber = Objects.requireNonNull(generationNumber, "expected parameter 'generationNumber' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs() {
        this.bucket = Input.empty();
        this.generationNumber = Input.empty();
        this.object = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> generationNumber;
        private Input<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generationNumber = defaults.generationNumber;
    	      this.object = defaults.object;
        }

        public Builder bucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder generationNumber(Input<String> generationNumber) {
            this.generationNumber = Objects.requireNonNull(generationNumber);
            return this;
        }

        public Builder generationNumber(String generationNumber) {
            this.generationNumber = Input.of(Objects.requireNonNull(generationNumber));
            return this;
        }

        public Builder object(Input<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder object(String object) {
            this.object = Input.of(Objects.requireNonNull(object));
            return this;
        }
        public PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs build() {
            return new PatchDeploymentPatchConfigPreStepLinuxExecStepConfigGcsObjectGetArgs(bucket, generationNumber, object);
        }
    }
}
