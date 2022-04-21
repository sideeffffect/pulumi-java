// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceSerialPortArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceSerialPortArgs Empty = new GetInstanceSerialPortArgs();

    /**
     * The name of the Compute Instance to read output from.
     * 
     */
    @Import(name="instance", required=true)
    private String instance;

    public String instance() {
        return this.instance;
    }

    /**
     * The number of the serial port to read output from. Possible values are 1-4.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

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

        public Builder instance(String instance) {
            $.instance = instance;
            return this;
        }

        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

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
