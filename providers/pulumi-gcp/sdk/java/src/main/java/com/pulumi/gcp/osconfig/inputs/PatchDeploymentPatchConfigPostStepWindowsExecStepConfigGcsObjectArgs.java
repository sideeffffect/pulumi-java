// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs extends ResourceArgs {

    public static final PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs Empty = new PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return Bucket of the Cloud Storage object.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    @Import(name="generationNumber", required=true)
    private Output<String> generationNumber;

    /**
     * @return Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
     * 
     */
    public Output<String> generationNumber() {
        return this.generationNumber;
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
    private Output<String> object;

    /**
     * @return Name of the Cloud Storage object.
     * 
     */
    public Output<String> object() {
        return this.object;
    }

    private PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs() {}

    private PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs(PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs $) {
        this.bucket = $.bucket;
        this.generationNumber = $.generationNumber;
        this.object = $.object;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs $;

        public Builder() {
            $ = new PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs();
        }

        public Builder(PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs defaults) {
            $ = new PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket Bucket of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket Bucket of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param generationNumber Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
         * 
         * @return builder
         * 
         */
        public Builder generationNumber(Output<String> generationNumber) {
            $.generationNumber = generationNumber;
            return this;
        }

        /**
         * @param generationNumber Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change.
         * 
         * @return builder
         * 
         */
        public Builder generationNumber(String generationNumber) {
            return generationNumber(Output.of(generationNumber));
        }

        /**
         * @param object Name of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder object(Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object Name of the Cloud Storage object.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        public PatchDeploymentPatchConfigPostStepWindowsExecStepConfigGcsObjectArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.generationNumber = Objects.requireNonNull($.generationNumber, "expected parameter 'generationNumber' to be non-null");
            $.object = Objects.requireNonNull($.object, "expected parameter 'object' to be non-null");
            return $;
        }
    }

}
