// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks.v2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudtasks.v2.enums.TaskResponseView;
import com.pulumi.googlenative.cloudtasks.v2.inputs.AppEngineHttpRequestArgs;
import com.pulumi.googlenative.cloudtasks.v2.inputs.HttpRequestArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    @Import(name="appEngineHttpRequest")
    private @Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest;

    /**
     * @return HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    public Optional<Output<AppEngineHttpRequestArgs>> appEngineHttpRequest() {
        return Optional.ofNullable(this.appEngineHttpRequest);
    }

    /**
     * The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task&#39;s `dispatch_deadline`, the app handler will not run for longer than than the service&#39;s timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler&#39;s timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
     * 
     */
    @Import(name="dispatchDeadline")
    private @Nullable Output<String> dispatchDeadline;

    /**
     * @return The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task&#39;s `dispatch_deadline`, the app handler will not run for longer than than the service&#39;s timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler&#39;s timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
     * 
     */
    public Optional<Output<String>> dispatchDeadline() {
        return Optional.ofNullable(this.dispatchDeadline);
    }

    /**
     * HTTP request that is sent to the worker. An HTTP task is a task that has HttpRequest set.
     * 
     */
    @Import(name="httpRequest")
    private @Nullable Output<HttpRequestArgs> httpRequest;

    /**
     * @return HTTP request that is sent to the worker. An HTTP task is a task that has HttpRequest set.
     * 
     */
    public Optional<Output<HttpRequestArgs>> httpRequest() {
        return Optional.ofNullable(this.httpRequest);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="queueId", required=true)
    private Output<String> queueId;

    public Output<String> queueId() {
        return this.queueId;
    }

    /**
     * The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
     * 
     */
    @Import(name="responseView")
    private @Nullable Output<TaskResponseView> responseView;

    /**
     * @return The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
     * 
     */
    public Optional<Output<TaskResponseView>> responseView() {
        return Optional.ofNullable(this.responseView);
    }

    /**
     * The time when the task is scheduled to be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @Import(name="scheduleTime")
    private @Nullable Output<String> scheduleTime;

    /**
     * @return The time when the task is scheduled to be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    public Optional<Output<String>> scheduleTime() {
        return Optional.ofNullable(this.scheduleTime);
    }

    private TaskArgs() {}

    private TaskArgs(TaskArgs $) {
        this.appEngineHttpRequest = $.appEngineHttpRequest;
        this.dispatchDeadline = $.dispatchDeadline;
        this.httpRequest = $.httpRequest;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.queueId = $.queueId;
        this.responseView = $.responseView;
        this.scheduleTime = $.scheduleTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskArgs $;

        public Builder() {
            $ = new TaskArgs();
        }

        public Builder(TaskArgs defaults) {
            $ = new TaskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngineHttpRequest HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
         * 
         * @return builder
         * 
         */
        public Builder appEngineHttpRequest(@Nullable Output<AppEngineHttpRequestArgs> appEngineHttpRequest) {
            $.appEngineHttpRequest = appEngineHttpRequest;
            return this;
        }

        /**
         * @param appEngineHttpRequest HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
         * 
         * @return builder
         * 
         */
        public Builder appEngineHttpRequest(AppEngineHttpRequestArgs appEngineHttpRequest) {
            return appEngineHttpRequest(Output.of(appEngineHttpRequest));
        }

        /**
         * @param dispatchDeadline The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task&#39;s `dispatch_deadline`, the app handler will not run for longer than than the service&#39;s timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler&#39;s timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
         * 
         * @return builder
         * 
         */
        public Builder dispatchDeadline(@Nullable Output<String> dispatchDeadline) {
            $.dispatchDeadline = dispatchDeadline;
            return this;
        }

        /**
         * @param dispatchDeadline The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task&#39;s `dispatch_deadline`, the app handler will not run for longer than than the service&#39;s timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler&#39;s timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
         * 
         * @return builder
         * 
         */
        public Builder dispatchDeadline(String dispatchDeadline) {
            return dispatchDeadline(Output.of(dispatchDeadline));
        }

        /**
         * @param httpRequest HTTP request that is sent to the worker. An HTTP task is a task that has HttpRequest set.
         * 
         * @return builder
         * 
         */
        public Builder httpRequest(@Nullable Output<HttpRequestArgs> httpRequest) {
            $.httpRequest = httpRequest;
            return this;
        }

        /**
         * @param httpRequest HTTP request that is sent to the worker. An HTTP task is a task that has HttpRequest set.
         * 
         * @return builder
         * 
         */
        public Builder httpRequest(HttpRequestArgs httpRequest) {
            return httpRequest(Output.of(httpRequest));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task&#39;s location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder queueId(Output<String> queueId) {
            $.queueId = queueId;
            return this;
        }

        public Builder queueId(String queueId) {
            return queueId(Output.of(queueId));
        }

        /**
         * @param responseView The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
         * 
         * @return builder
         * 
         */
        public Builder responseView(@Nullable Output<TaskResponseView> responseView) {
            $.responseView = responseView;
            return this;
        }

        /**
         * @param responseView The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
         * 
         * @return builder
         * 
         */
        public Builder responseView(TaskResponseView responseView) {
            return responseView(Output.of(responseView));
        }

        /**
         * @param scheduleTime The time when the task is scheduled to be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
         * 
         * @return builder
         * 
         */
        public Builder scheduleTime(@Nullable Output<String> scheduleTime) {
            $.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * @param scheduleTime The time when the task is scheduled to be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
         * 
         * @return builder
         * 
         */
        public Builder scheduleTime(String scheduleTime) {
            return scheduleTime(Output.of(scheduleTime));
        }

        public TaskArgs build() {
            $.queueId = Objects.requireNonNull($.queueId, "expected parameter 'queueId' to be non-null");
            return $;
        }
    }

}
