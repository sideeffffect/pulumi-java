// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.cloudscheduler.JobArgs;
import com.pulumi.gcp.cloudscheduler.inputs.JobState;
import com.pulumi.gcp.cloudscheduler.outputs.JobAppEngineHttpTarget;
import com.pulumi.gcp.cloudscheduler.outputs.JobHttpTarget;
import com.pulumi.gcp.cloudscheduler.outputs.JobPubsubTarget;
import com.pulumi.gcp.cloudscheduler.outputs.JobRetryConfig;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * A scheduled job that can publish a pubsub message or a http request
 * every X interval of time, using crontab format string.
 * 
 * To use Cloud Scheduler your project must contain an App Engine app
 * that is located in one of the supported regions. If your project
 * does not have an App Engine app, you must create one.
 * 
 * To get more information about Job, see:
 * 
 * * [API documentation](https://cloud.google.com/scheduler/docs/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/scheduler/)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Job can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job default projects/{{project}}/locations/{{region}}/jobs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudscheduler/job:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * App Engine HTTP target.
     * If the job providers a App Engine HTTP target the cron will
     * send a request to the service instance
     * Structure is documented below.
     * 
     */
    @Export(name="appEngineHttpTarget", type=JobAppEngineHttpTarget.class, parameters={})
    private Output</* @Nullable */ JobAppEngineHttpTarget> appEngineHttpTarget;

    /**
     * @return App Engine HTTP target.
     * If the job providers a App Engine HTTP target the cron will
     * send a request to the service instance
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ JobAppEngineHttpTarget> appEngineHttpTarget() {
        return this.appEngineHttpTarget;
    }
    /**
     * The deadline for job attempts. If the request handler does not respond by this deadline then the request is
     * cancelled and the attempt is marked as a DEADLINE_EXCEEDED failure. The failed attempt can be viewed in
     * execution logs. Cloud Scheduler will retry the job according to the RetryConfig.
     * The allowed duration for this deadline is:
     * * For HTTP targets, between 15 seconds and 30 minutes.
     * * For App Engine HTTP targets, between 15 seconds and 24 hours.
     * * **Note**: For PubSub targets, this field is ignored - setting it will introduce an unresolvable diff.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    @Export(name="attemptDeadline", type=String.class, parameters={})
    private Output</* @Nullable */ String> attemptDeadline;

    /**
     * @return The deadline for job attempts. If the request handler does not respond by this deadline then the request is
     * cancelled and the attempt is marked as a DEADLINE_EXCEEDED failure. The failed attempt can be viewed in
     * execution logs. Cloud Scheduler will retry the job according to the RetryConfig.
     * The allowed duration for this deadline is:
     * * For HTTP targets, between 15 seconds and 30 minutes.
     * * For App Engine HTTP targets, between 15 seconds and 24 hours.
     * * **Note**: For PubSub targets, this field is ignored - setting it will introduce an unresolvable diff.
     *   A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s"
     * 
     */
    public Output</* @Nullable */ String> attemptDeadline() {
        return this.attemptDeadline;
    }
    /**
     * A human-readable description for the job.
     * This string must not contain more than 500 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description for the job.
     * This string must not contain more than 500 characters.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * HTTP target.
     * If the job providers a http_target the cron will
     * send a request to the targeted url
     * Structure is documented below.
     * 
     */
    @Export(name="httpTarget", type=JobHttpTarget.class, parameters={})
    private Output</* @Nullable */ JobHttpTarget> httpTarget;

    /**
     * @return HTTP target.
     * If the job providers a http_target the cron will
     * send a request to the targeted url
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ JobHttpTarget> httpTarget() {
        return this.httpTarget;
    }
    /**
     * The name of the job.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the job.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Pub/Sub target
     * If the job providers a Pub/Sub target the cron will publish
     * a message to the provided topic
     * Structure is documented below.
     * 
     */
    @Export(name="pubsubTarget", type=JobPubsubTarget.class, parameters={})
    private Output</* @Nullable */ JobPubsubTarget> pubsubTarget;

    /**
     * @return Pub/Sub target
     * If the job providers a Pub/Sub target the cron will publish
     * a message to the provided topic
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ JobPubsubTarget> pubsubTarget() {
        return this.pubsubTarget;
    }
    /**
     * Region where the scheduler job resides. If it is not provided, this provider will use the provider default.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region where the scheduler job resides. If it is not provided, this provider will use the provider default.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * By default, if a job does not complete successfully,
     * meaning that an acknowledgement is not received from the handler,
     * then it will be retried with exponential backoff according to the settings
     * Structure is documented below.
     * 
     */
    @Export(name="retryConfig", type=JobRetryConfig.class, parameters={})
    private Output</* @Nullable */ JobRetryConfig> retryConfig;

    /**
     * @return By default, if a job does not complete successfully,
     * meaning that an acknowledgement is not received from the handler,
     * then it will be retried with exponential backoff according to the settings
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ JobRetryConfig> retryConfig() {
        return this.retryConfig;
    }
    /**
     * Describes the schedule on which the job will be executed.
     * 
     */
    @Export(name="schedule", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedule;

    /**
     * @return Describes the schedule on which the job will be executed.
     * 
     */
    public Output</* @Nullable */ String> schedule() {
        return this.schedule;
    }
    /**
     * Specifies the time zone to be used in interpreting schedule.
     * The value of this field must be a time zone name from the tz database.
     * 
     */
    @Export(name="timeZone", type=String.class, parameters={})
    private Output</* @Nullable */ String> timeZone;

    /**
     * @return Specifies the time zone to be used in interpreting schedule.
     * The value of this field must be a time zone name from the tz database.
     * 
     */
    public Output</* @Nullable */ String> timeZone() {
        return this.timeZone;
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
    public Job(String name, @Nullable JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, @Nullable JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudscheduler/job:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudscheduler/job:Job", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Job get(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, state, options);
    }
}
