// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices.v1.inputs.CloudAuditOptionsArgs;
import com.pulumi.googlenative.gameservices.v1.inputs.CounterOptionsArgs;
import com.pulumi.googlenative.gameservices.v1.inputs.DataAccessOptionsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies what kind of log the caller must write
 * 
 */
public final class LogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogConfigArgs Empty = new LogConfigArgs();

    /**
     * Cloud audit options.
     * 
     */
    @Import(name="cloudAudit")
    private @Nullable Output<CloudAuditOptionsArgs> cloudAudit;

    /**
     * @return Cloud audit options.
     * 
     */
    public Optional<Output<CloudAuditOptionsArgs>> cloudAudit() {
        return Optional.ofNullable(this.cloudAudit);
    }

    /**
     * Counter options.
     * 
     */
    @Import(name="counter")
    private @Nullable Output<CounterOptionsArgs> counter;

    /**
     * @return Counter options.
     * 
     */
    public Optional<Output<CounterOptionsArgs>> counter() {
        return Optional.ofNullable(this.counter);
    }

    /**
     * Data access options.
     * 
     */
    @Import(name="dataAccess")
    private @Nullable Output<DataAccessOptionsArgs> dataAccess;

    /**
     * @return Data access options.
     * 
     */
    public Optional<Output<DataAccessOptionsArgs>> dataAccess() {
        return Optional.ofNullable(this.dataAccess);
    }

    private LogConfigArgs() {}

    private LogConfigArgs(LogConfigArgs $) {
        this.cloudAudit = $.cloudAudit;
        this.counter = $.counter;
        this.dataAccess = $.dataAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogConfigArgs $;

        public Builder() {
            $ = new LogConfigArgs();
        }

        public Builder(LogConfigArgs defaults) {
            $ = new LogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cloudAudit Cloud audit options.
         * 
         * @return builder
         * 
         */
        public Builder cloudAudit(@Nullable Output<CloudAuditOptionsArgs> cloudAudit) {
            $.cloudAudit = cloudAudit;
            return this;
        }

        /**
         * @param cloudAudit Cloud audit options.
         * 
         * @return builder
         * 
         */
        public Builder cloudAudit(CloudAuditOptionsArgs cloudAudit) {
            return cloudAudit(Output.of(cloudAudit));
        }

        /**
         * @param counter Counter options.
         * 
         * @return builder
         * 
         */
        public Builder counter(@Nullable Output<CounterOptionsArgs> counter) {
            $.counter = counter;
            return this;
        }

        /**
         * @param counter Counter options.
         * 
         * @return builder
         * 
         */
        public Builder counter(CounterOptionsArgs counter) {
            return counter(Output.of(counter));
        }

        /**
         * @param dataAccess Data access options.
         * 
         * @return builder
         * 
         */
        public Builder dataAccess(@Nullable Output<DataAccessOptionsArgs> dataAccess) {
            $.dataAccess = dataAccess;
            return this;
        }

        /**
         * @param dataAccess Data access options.
         * 
         * @return builder
         * 
         */
        public Builder dataAccess(DataAccessOptionsArgs dataAccess) {
            return dataAccess(Output.of(dataAccess));
        }

        public LogConfigArgs build() {
            return $;
        }
    }

}
