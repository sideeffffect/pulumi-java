// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.SourceTriggerEvent;
import com.pulumi.azurenative.containerregistry.enums.TriggerStatus;
import com.pulumi.azurenative.containerregistry.inputs.SourcePropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a source based trigger.
 * 
 */
public final class SourceTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceTriggerArgs Empty = new SourceTriggerArgs();

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the trigger.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The properties that describes the source(code) for the task.
     * 
     */
    @Import(name="sourceRepository", required=true)
    private Output<SourcePropertiesArgs> sourceRepository;

    /**
     * @return The properties that describes the source(code) for the task.
     * 
     */
    public Output<SourcePropertiesArgs> sourceRepository() {
        return this.sourceRepository;
    }

    /**
     * The source event corresponding to the trigger.
     * 
     */
    @Import(name="sourceTriggerEvents", required=true)
    private Output<List<Either<String,SourceTriggerEvent>>> sourceTriggerEvents;

    /**
     * @return The source event corresponding to the trigger.
     * 
     */
    public Output<List<Either<String,SourceTriggerEvent>>> sourceTriggerEvents() {
        return this.sourceTriggerEvents;
    }

    /**
     * The current status of trigger.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,TriggerStatus>> status;

    /**
     * @return The current status of trigger.
     * 
     */
    public Optional<Output<Either<String,TriggerStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    private SourceTriggerArgs() {}

    private SourceTriggerArgs(SourceTriggerArgs $) {
        this.name = $.name;
        this.sourceRepository = $.sourceRepository;
        this.sourceTriggerEvents = $.sourceTriggerEvents;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceTriggerArgs $;

        public Builder() {
            $ = new SourceTriggerArgs();
        }

        public Builder(SourceTriggerArgs defaults) {
            $ = new SourceTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sourceRepository The properties that describes the source(code) for the task.
         * 
         * @return builder
         * 
         */
        public Builder sourceRepository(Output<SourcePropertiesArgs> sourceRepository) {
            $.sourceRepository = sourceRepository;
            return this;
        }

        /**
         * @param sourceRepository The properties that describes the source(code) for the task.
         * 
         * @return builder
         * 
         */
        public Builder sourceRepository(SourcePropertiesArgs sourceRepository) {
            return sourceRepository(Output.of(sourceRepository));
        }

        /**
         * @param sourceTriggerEvents The source event corresponding to the trigger.
         * 
         * @return builder
         * 
         */
        public Builder sourceTriggerEvents(Output<List<Either<String,SourceTriggerEvent>>> sourceTriggerEvents) {
            $.sourceTriggerEvents = sourceTriggerEvents;
            return this;
        }

        /**
         * @param sourceTriggerEvents The source event corresponding to the trigger.
         * 
         * @return builder
         * 
         */
        public Builder sourceTriggerEvents(List<Either<String,SourceTriggerEvent>> sourceTriggerEvents) {
            return sourceTriggerEvents(Output.of(sourceTriggerEvents));
        }

        /**
         * @param sourceTriggerEvents The source event corresponding to the trigger.
         * 
         * @return builder
         * 
         */
        public Builder sourceTriggerEvents(Either<String,SourceTriggerEvent>... sourceTriggerEvents) {
            return sourceTriggerEvents(List.of(sourceTriggerEvents));
        }

        /**
         * @param status The current status of trigger.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,TriggerStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The current status of trigger.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,TriggerStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The current status of trigger.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The current status of trigger.
         * 
         * @return builder
         * 
         */
        public Builder status(TriggerStatus status) {
            return status(Either.ofRight(status));
        }

        public SourceTriggerArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sourceRepository = Objects.requireNonNull($.sourceRepository, "expected parameter 'sourceRepository' to be non-null");
            $.sourceTriggerEvents = Objects.requireNonNull($.sourceTriggerEvents, "expected parameter 'sourceTriggerEvents' to be non-null");
            $.status = Codegen.stringProp("status").left(TriggerStatus.class).output().arg($.status).def("Enabled").getNullable();
            return $;
        }
    }

}
