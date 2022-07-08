// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.composer.v1.inputs.SchedulerResourceArgs;
import com.pulumi.googlenative.composer.v1.inputs.WebServerResourceArgs;
import com.pulumi.googlenative.composer.v1.inputs.WorkerResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Kubernetes workloads configuration for GKE cluster associated with the Cloud Composer environment. Supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
 * 
 */
public final class WorkloadsConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadsConfigArgs Empty = new WorkloadsConfigArgs();

    /**
     * Optional. Resources used by Airflow schedulers.
     * 
     */
    @Import(name="scheduler")
    private @Nullable Output<SchedulerResourceArgs> scheduler;

    /**
     * @return Optional. Resources used by Airflow schedulers.
     * 
     */
    public Optional<Output<SchedulerResourceArgs>> scheduler() {
        return Optional.ofNullable(this.scheduler);
    }

    /**
     * Optional. Resources used by Airflow web server.
     * 
     */
    @Import(name="webServer")
    private @Nullable Output<WebServerResourceArgs> webServer;

    /**
     * @return Optional. Resources used by Airflow web server.
     * 
     */
    public Optional<Output<WebServerResourceArgs>> webServer() {
        return Optional.ofNullable(this.webServer);
    }

    /**
     * Optional. Resources used by Airflow workers.
     * 
     */
    @Import(name="worker")
    private @Nullable Output<WorkerResourceArgs> worker;

    /**
     * @return Optional. Resources used by Airflow workers.
     * 
     */
    public Optional<Output<WorkerResourceArgs>> worker() {
        return Optional.ofNullable(this.worker);
    }

    private WorkloadsConfigArgs() {}

    private WorkloadsConfigArgs(WorkloadsConfigArgs $) {
        this.scheduler = $.scheduler;
        this.webServer = $.webServer;
        this.worker = $.worker;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadsConfigArgs $;

        public Builder() {
            $ = new WorkloadsConfigArgs();
        }

        public Builder(WorkloadsConfigArgs defaults) {
            $ = new WorkloadsConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scheduler Optional. Resources used by Airflow schedulers.
         * 
         * @return builder
         * 
         */
        public Builder scheduler(@Nullable Output<SchedulerResourceArgs> scheduler) {
            $.scheduler = scheduler;
            return this;
        }

        /**
         * @param scheduler Optional. Resources used by Airflow schedulers.
         * 
         * @return builder
         * 
         */
        public Builder scheduler(SchedulerResourceArgs scheduler) {
            return scheduler(Output.of(scheduler));
        }

        /**
         * @param webServer Optional. Resources used by Airflow web server.
         * 
         * @return builder
         * 
         */
        public Builder webServer(@Nullable Output<WebServerResourceArgs> webServer) {
            $.webServer = webServer;
            return this;
        }

        /**
         * @param webServer Optional. Resources used by Airflow web server.
         * 
         * @return builder
         * 
         */
        public Builder webServer(WebServerResourceArgs webServer) {
            return webServer(Output.of(webServer));
        }

        /**
         * @param worker Optional. Resources used by Airflow workers.
         * 
         * @return builder
         * 
         */
        public Builder worker(@Nullable Output<WorkerResourceArgs> worker) {
            $.worker = worker;
            return this;
        }

        /**
         * @param worker Optional. Resources used by Airflow workers.
         * 
         * @return builder
         * 
         */
        public Builder worker(WorkerResourceArgs worker) {
            return worker(Output.of(worker));
        }

        public WorkloadsConfigArgs build() {
            return $;
        }
    }

}
