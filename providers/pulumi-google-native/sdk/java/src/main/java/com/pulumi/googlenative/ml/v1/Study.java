// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.ml.v1.StudyArgs;
import com.pulumi.googlenative.ml.v1.outputs.GoogleCloudMlV1__StudyConfigResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a study.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:ml/v1:Study")
public class Study extends com.pulumi.resources.CustomResource {
    /**
     * Time at which the study was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time at which the study was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A human readable reason why the Study is inactive. This should be empty if a study is ACTIVE or COMPLETED.
     * 
     */
    @Export(name="inactiveReason", type=String.class, parameters={})
    private Output<String> inactiveReason;

    /**
     * @return A human readable reason why the Study is inactive. This should be empty if a study is ACTIVE or COMPLETED.
     * 
     */
    public Output<String> inactiveReason() {
        return this.inactiveReason;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of a study.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of a study.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The detailed state of a study.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The detailed state of a study.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Configuration of the study.
     * 
     */
    @Export(name="studyConfig", type=GoogleCloudMlV1__StudyConfigResponse.class, parameters={})
    private Output<GoogleCloudMlV1__StudyConfigResponse> studyConfig;

    /**
     * @return Configuration of the study.
     * 
     */
    public Output<GoogleCloudMlV1__StudyConfigResponse> studyConfig() {
        return this.studyConfig;
    }
    /**
     * Required. The ID to use for the study, which will become the final component of the study&#39;s resource name.
     * 
     */
    @Export(name="studyId", type=String.class, parameters={})
    private Output<String> studyId;

    /**
     * @return Required. The ID to use for the study, which will become the final component of the study&#39;s resource name.
     * 
     */
    public Output<String> studyId() {
        return this.studyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Study(String name) {
        this(name, StudyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Study(String name, StudyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Study(String name, StudyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Study", name, args == null ? StudyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Study(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:ml/v1:Study", name, null, makeResourceOptions(options, id));
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
    public static Study get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Study(name, id, options);
    }
}
