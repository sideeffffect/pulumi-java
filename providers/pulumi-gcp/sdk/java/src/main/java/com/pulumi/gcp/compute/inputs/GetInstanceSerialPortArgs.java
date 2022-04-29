// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceSerialPortArgs extends InvokeArgs {

    public static final GetInstanceSerialPortArgs Empty = new GetInstanceSerialPortArgs();

    /**
     * The name of the Compute Instance to read output from.
     * 
     */
    @Import(name="instance", required=true)
    private String instance;

    /**
     * @return The name of the Compute Instance to read output from.
     * 
     */
    public String instance() {
        return this.instance;
    }

    /**
     * The number of the serial port to read output from. Possible values are 1-4.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    /**
     * @return The number of the serial port to read output from. Possible values are 1-4.
     * 
     */
    public Integer port() {
        return this.port;
    }

    /**
     * The project in which the Compute Instance exists. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The project in which the Compute Instance exists. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The zone in which the Compute Instance exists.
     * If it is not provided, the provider zone is used.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return The zone in which the Compute Instance exists.
     * If it is not provided, the provider zone is used.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetInstanceSerialPortArgs() {}

    private GetInstanceSerialPortArgs(GetInstanceSerialPortArgs $) {
        this.instance = $.instance;
        this.port = $.port;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceSerialPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceSerialPortArgs $;

        public Builder() {
            $ = new GetInstanceSerialPortArgs();
        }

        public Builder(GetInstanceSerialPortArgs defaults) {
            $ = new GetInstanceSerialPortArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instance The name of the Compute Instance to read output from.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param port The number of the serial port to read output from. Possible values are 1-4.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        /**
         * @param project The project in which the Compute Instance exists. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        /**
         * @param zone The zone in which the Compute Instance exists.
         * If it is not provided, the provider zone is used.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetInstanceSerialPortArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
