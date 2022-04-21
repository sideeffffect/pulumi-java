// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.ExecActionArgs;
import com.pulumi.googlenative.run_v1alpha1.inputs.HTTPGetActionArgs;
import com.pulumi.googlenative.run_v1alpha1.inputs.TCPSocketActionArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Not supported by Cloud Run Probe describes a health check to be performed against a container to determine whether it is alive or ready to receive traffic.
 * 
 */
public final class ProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProbeArgs Empty = new ProbeArgs();

    /**
     * (Optional) One and only one of the following should be specified. Exec specifies the action to take. A field inlined from the Handler message.
     * 
     */
    @Import(name="exec")
    private @Nullable Output<ExecActionArgs> exec;

    public Optional<Output<ExecActionArgs>> exec() {
        return Optional.ofNullable(this.exec);
    }

    /**
     * (Optional) Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler message.
     * 
     */
    @Import(name="httpGet")
    private @Nullable Output<HTTPGetActionArgs> httpGet;

    public Optional<Output<HTTPGetActionArgs>> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }

    /**
     * (Optional) Number of seconds after the container has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="initialDelaySeconds")
    private @Nullable Output<Integer> initialDelaySeconds;

    public Optional<Output<Integer>> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }

    /**
     * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     * 
     */
    @Import(name="periodSeconds")
    private @Nullable Output<Integer> periodSeconds;

    public Optional<Output<Integer>> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }

    /**
     * (Optional) Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Output<Integer> successThreshold;

    public Optional<Output<Integer>> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A field inlined from the Handler message.
     * 
     */
    @Import(name="tcpSocket")
    private @Nullable Output<TCPSocketActionArgs> tcpSocket;

    public Optional<Output<TCPSocketActionArgs>> tcpSocket() {
        return Optional.ofNullable(this.tcpSocket);
    }

    /**
     * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private ProbeArgs() {}

    private ProbeArgs(ProbeArgs $) {
        this.exec = $.exec;
        this.failureThreshold = $.failureThreshold;
        this.httpGet = $.httpGet;
        this.initialDelaySeconds = $.initialDelaySeconds;
        this.periodSeconds = $.periodSeconds;
        this.successThreshold = $.successThreshold;
        this.tcpSocket = $.tcpSocket;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProbeArgs $;

        public Builder() {
            $ = new ProbeArgs();
        }

        public Builder(ProbeArgs defaults) {
            $ = new ProbeArgs(Objects.requireNonNull(defaults));
        }

        public Builder exec(@Nullable Output<ExecActionArgs> exec) {
            $.exec = exec;
            return this;
        }

        public Builder exec(ExecActionArgs exec) {
            return exec(Output.of(exec));
        }

        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        public Builder httpGet(@Nullable Output<HTTPGetActionArgs> httpGet) {
            $.httpGet = httpGet;
            return this;
        }

        public Builder httpGet(HTTPGetActionArgs httpGet) {
            return httpGet(Output.of(httpGet));
        }

        public Builder initialDelaySeconds(@Nullable Output<Integer> initialDelaySeconds) {
            $.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            return initialDelaySeconds(Output.of(initialDelaySeconds));
        }

        public Builder periodSeconds(@Nullable Output<Integer> periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        public Builder periodSeconds(Integer periodSeconds) {
            return periodSeconds(Output.of(periodSeconds));
        }

        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        public Builder successThreshold(Integer successThreshold) {
            return successThreshold(Output.of(successThreshold));
        }

        public Builder tcpSocket(@Nullable Output<TCPSocketActionArgs> tcpSocket) {
            $.tcpSocket = tcpSocket;
            return this;
        }

        public Builder tcpSocket(TCPSocketActionArgs tcpSocket) {
            return tcpSocket(Output.of(tcpSocket));
        }

        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public ProbeArgs build() {
            return $;
        }
    }

}
