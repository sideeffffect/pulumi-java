// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.ml.v1.JobArgs;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__PredictionInputResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__PredictionOutputResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__TrainingInputResponse;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__TrainingOutputResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a training or a batch prediction job.
 * Auto-naming is currently not supported for this resource.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:ml/v1:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * When the job was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return When the job was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * When the job processing was completed.
     * 
     */
    @Export(name="endTime", type=String.class, parameters={})
    private Output<String> endTime;

    /**
     * @return When the job processing was completed.
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The details of a failure or a cancellation.
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return The details of a failure or a cancellation.
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a job from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform job updates in order to avoid race conditions: An `etag` is returned in the response to `GetJob`, and systems are expected to put that etag in the request to `UpdateJob` to ensure that their change will be applied to the same version of the job.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a job from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform job updates in order to avoid race conditions: An `etag` is returned in the response to `GetJob`, and systems are expected to put that etag in the request to `UpdateJob` to ensure that their change will be applied to the same version of the job.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The user-specified id of the job.
     * 
     */
    @Export(name="jobId", type=String.class, parameters={})
    private Output<String> jobId;

    /**
     * @return The user-specified id of the job.
     * 
     */
    public Output<String> jobId() {
        return this.jobId;
    }
    /**
     * It&#39;s only effect when the job is in QUEUED state. If it&#39;s positive, it indicates the job&#39;s position in the job scheduler. It&#39;s 0 when the job is already scheduled.
     * 
     */
    @Export(name="jobPosition", type=String.class, parameters={})
    private Output<String> jobPosition;

    /**
     * @return It&#39;s only effect when the job is in QUEUED state. If it&#39;s positive, it indicates the job&#39;s position in the job scheduler. It&#39;s 0 when the job is already scheduled.
     * 
     */
    public Output<String> jobPosition() {
        return this.jobPosition;
    }
    /**
     * Optional. One or more labels that you can add, to organize your jobs. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. One or more labels that you can add, to organize your jobs. Each label is a key-value pair, where both the key and the value are arbitrary strings that you supply. For more information, see the documentation on using labels.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Input parameters to create a prediction job.
     * 
     */
    @Export(name="predictionInput", type=GoogleCloudMlV1__PredictionInputResponse.class, parameters={})
    private Output<GoogleCloudMlV1__PredictionInputResponse> predictionInput;

    /**
     * @return Input parameters to create a prediction job.
     * 
     */
    public Output<GoogleCloudMlV1__PredictionInputResponse> predictionInput() {
        return this.predictionInput;
    }
    /**
     * The current prediction job result.
     * 
     */
    @Export(name="predictionOutput", type=GoogleCloudMlV1__PredictionOutputResponse.class, parameters={})
    private Output<GoogleCloudMlV1__PredictionOutputResponse> predictionOutput;

    /**
     * @return The current prediction job result.
     * 
     */
    public Output<GoogleCloudMlV1__PredictionOutputResponse> predictionOutput() {
        return this.predictionOutput;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * When the job processing was started.
     * 
     */
    @Export(name="startTime", type=String.class, parameters={})
    private Output<String> startTime;

    /**
     * @return When the job processing was started.
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * The detailed state of a job.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The detailed state of a job.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Input parameters to create a training job.
     * 
     */
    @Export(name="trainingInput", type=GoogleCloudMlV1__TrainingInputResponse.class, parameters={})
    private Output<GoogleCloudMlV1__TrainingInputResponse> trainingInput;

    /**
     * @return Input parameters to create a training job.
     * 
     */
    public Output<GoogleCloudMlV1__TrainingInputResponse> trainingInput() {
        return this.trainingInput;
    }
    /**
     * The current training job result.
     * 
     */
    @Export(name="trainingOutput", type=GoogleCloudMlV1__TrainingOutputResponse.class, parameters={})
    private Output<GoogleCloudMlV1__TrainingOutputResponse> trainingOutput;

    /**
     * @return The current training job result.
     * 
     */
    public Output<GoogleCloudMlV1__TrainingOutputResponse> trainingOutput() {
        return this.trainingOutput;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Job", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, options);
    }
}
