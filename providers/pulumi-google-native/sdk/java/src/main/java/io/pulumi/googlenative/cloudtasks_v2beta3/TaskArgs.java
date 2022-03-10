// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudtasks_v2beta3.enums.TaskResponseView;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.AppEngineHttpRequestArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.HttpRequestArgs;
import io.pulumi.googlenative.cloudtasks_v2beta3.inputs.PullMessageArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * HTTP request that is sent to the App Engine app handler. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    @InputImport(name="appEngineHttpRequest")
      private final @Nullable Input<AppEngineHttpRequestArgs> appEngineHttpRequest;

    public Input<AppEngineHttpRequestArgs> getAppEngineHttpRequest() {
        return this.appEngineHttpRequest == null ? Input.empty() : this.appEngineHttpRequest;
    }

    /**
     * The deadline for requests sent to the worker. If the worker does not respond by this deadline then the request is cancelled and the attempt is marked as a `DEADLINE_EXCEEDED` failure. Cloud Tasks will retry the task according to the RetryConfig. Note that when the request is cancelled, Cloud Tasks will stop listening for the response, but whether the worker stops processing depends on the worker. For example, if the worker is stuck, it may not react to cancelled requests. The default and maximum values depend on the type of request: * For HTTP tasks, the default is 10 minutes. The deadline must be in the interval [15 seconds, 30 minutes]. * For App Engine tasks, 0 indicates that the request has the default deadline. The default deadline depends on the [scaling type](https://cloud.google.com/appengine/docs/standard/go/how-instances-are-managed#instance_scaling) of the service: 10 minutes for standard apps with automatic scaling, 24 hours for standard apps with manual and basic scaling, and 60 minutes for flex apps. If the request deadline is set, it must be in the interval [15 seconds, 24 hours 15 seconds]. Regardless of the task's `dispatch_deadline`, the app handler will not run for longer than than the service's timeout. We recommend setting the `dispatch_deadline` to at most a few seconds more than the app handler's timeout. For more information see [Timeouts](https://cloud.google.com/tasks/docs/creating-appengine-handlers#timeouts). `dispatch_deadline` will be truncated to the nearest millisecond. The deadline is an approximate deadline.
     * 
     */
    @InputImport(name="dispatchDeadline")
      private final @Nullable Input<String> dispatchDeadline;

    public Input<String> getDispatchDeadline() {
        return this.dispatchDeadline == null ? Input.empty() : this.dispatchDeadline;
    }

    /**
     * HTTP request that is sent to the task's target. An HTTP task is a task that has HttpRequest set.
     * 
     */
    @InputImport(name="httpRequest")
      private final @Nullable Input<HttpRequestArgs> httpRequest;

    public Input<HttpRequestArgs> getHttpRequest() {
        return this.httpRequest == null ? Input.empty() : this.httpRequest;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Pull Message contained in a task in a PULL queue type. This payload type cannot be explicitly set through Cloud Tasks API. Its purpose, currently is to provide backward compatibility with App Engine Task Queue [pull](https://cloud.google.com/appengine/docs/standard/java/taskqueue/pull/) queues to provide a way to inspect contents of pull tasks through the CloudTasks.GetTask.
     * 
     */
    @InputImport(name="pullMessage")
      private final @Nullable Input<PullMessageArgs> pullMessage;

    public Input<PullMessageArgs> getPullMessage() {
        return this.pullMessage == null ? Input.empty() : this.pullMessage;
    }

    @InputImport(name="queueId", required=true)
      private final Input<String> queueId;

    public Input<String> getQueueId() {
        return this.queueId;
    }

    /**
     * The response_view specifies which subset of the Task will be returned. By default response_view is BASIC; not all information is retrieved by default because some data, such as payloads, might be desirable to return only when needed because of its large size or because of the sensitivity of data that it contains. Authorization for FULL requires `cloudtasks.tasks.fullView` [Google IAM](https://cloud.google.com/iam/) permission on the Task resource.
     * 
     */
    @InputImport(name="responseView")
      private final @Nullable Input<TaskResponseView> responseView;

    public Input<TaskResponseView> getResponseView() {
        return this.responseView == null ? Input.empty() : this.responseView;
    }

    /**
     * The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    @InputImport(name="scheduleTime")
      private final @Nullable Input<String> scheduleTime;

    public Input<String> getScheduleTime() {
        return this.scheduleTime == null ? Input.empty() : this.scheduleTime;
    }

    public TaskArgs(
        @Nullable Input<AppEngineHttpRequestArgs> appEngineHttpRequest,
        @Nullable Input<String> dispatchDeadline,
        @Nullable Input<HttpRequestArgs> httpRequest,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<PullMessageArgs> pullMessage,
        Input<String> queueId,
        @Nullable Input<TaskResponseView> responseView,
        @Nullable Input<String> scheduleTime) {
        this.appEngineHttpRequest = appEngineHttpRequest;
        this.dispatchDeadline = dispatchDeadline;
        this.httpRequest = httpRequest;
        this.location = location;
        this.name = name;
        this.project = project;
        this.pullMessage = pullMessage;
        this.queueId = Objects.requireNonNull(queueId, "expected parameter 'queueId' to be non-null");
        this.responseView = responseView;
        this.scheduleTime = scheduleTime;
    }

    private TaskArgs() {
        this.appEngineHttpRequest = Input.empty();
        this.dispatchDeadline = Input.empty();
        this.httpRequest = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.pullMessage = Input.empty();
        this.queueId = Input.empty();
        this.responseView = Input.empty();
        this.scheduleTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AppEngineHttpRequestArgs> appEngineHttpRequest;
        private @Nullable Input<String> dispatchDeadline;
        private @Nullable Input<HttpRequestArgs> httpRequest;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<PullMessageArgs> pullMessage;
        private Input<String> queueId;
        private @Nullable Input<TaskResponseView> responseView;
        private @Nullable Input<String> scheduleTime;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpRequest = defaults.appEngineHttpRequest;
    	      this.dispatchDeadline = defaults.dispatchDeadline;
    	      this.httpRequest = defaults.httpRequest;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pullMessage = defaults.pullMessage;
    	      this.queueId = defaults.queueId;
    	      this.responseView = defaults.responseView;
    	      this.scheduleTime = defaults.scheduleTime;
        }

        public Builder appEngineHttpRequest(@Nullable Input<AppEngineHttpRequestArgs> appEngineHttpRequest) {
            this.appEngineHttpRequest = appEngineHttpRequest;
            return this;
        }

        public Builder appEngineHttpRequest(@Nullable AppEngineHttpRequestArgs appEngineHttpRequest) {
            this.appEngineHttpRequest = Input.ofNullable(appEngineHttpRequest);
            return this;
        }

        public Builder dispatchDeadline(@Nullable Input<String> dispatchDeadline) {
            this.dispatchDeadline = dispatchDeadline;
            return this;
        }

        public Builder dispatchDeadline(@Nullable String dispatchDeadline) {
            this.dispatchDeadline = Input.ofNullable(dispatchDeadline);
            return this;
        }

        public Builder httpRequest(@Nullable Input<HttpRequestArgs> httpRequest) {
            this.httpRequest = httpRequest;
            return this;
        }

        public Builder httpRequest(@Nullable HttpRequestArgs httpRequest) {
            this.httpRequest = Input.ofNullable(httpRequest);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder pullMessage(@Nullable Input<PullMessageArgs> pullMessage) {
            this.pullMessage = pullMessage;
            return this;
        }

        public Builder pullMessage(@Nullable PullMessageArgs pullMessage) {
            this.pullMessage = Input.ofNullable(pullMessage);
            return this;
        }

        public Builder queueId(Input<String> queueId) {
            this.queueId = Objects.requireNonNull(queueId);
            return this;
        }

        public Builder queueId(String queueId) {
            this.queueId = Input.of(Objects.requireNonNull(queueId));
            return this;
        }

        public Builder responseView(@Nullable Input<TaskResponseView> responseView) {
            this.responseView = responseView;
            return this;
        }

        public Builder responseView(@Nullable TaskResponseView responseView) {
            this.responseView = Input.ofNullable(responseView);
            return this;
        }

        public Builder scheduleTime(@Nullable Input<String> scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }

        public Builder scheduleTime(@Nullable String scheduleTime) {
            this.scheduleTime = Input.ofNullable(scheduleTime);
            return this;
        }
        public TaskArgs build() {
            return new TaskArgs(appEngineHttpRequest, dispatchDeadline, httpRequest, location, name, project, pullMessage, queueId, responseView, scheduleTime);
        }
    }
}
