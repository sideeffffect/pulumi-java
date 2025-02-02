// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The protection mode of the collection/file types. Exe/Msi/Script are used for Windows, Executable is used for Linux.
 * 
 */
public final class ProtectionModeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProtectionModeArgs Empty = new ProtectionModeArgs();

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Import(name="exe")
    private @Nullable Output<String> exe;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Optional<Output<String>> exe() {
        return Optional.ofNullable(this.exe);
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Import(name="executable")
    private @Nullable Output<String> executable;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Optional<Output<String>> executable() {
        return Optional.ofNullable(this.executable);
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Import(name="msi")
    private @Nullable Output<String> msi;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Optional<Output<String>> msi() {
        return Optional.ofNullable(this.msi);
    }

    /**
     * The application control policy enforcement/protection mode of the machine group
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return The application control policy enforcement/protection mode of the machine group
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    private ProtectionModeArgs() {}

    private ProtectionModeArgs(ProtectionModeArgs $) {
        this.exe = $.exe;
        this.executable = $.executable;
        this.msi = $.msi;
        this.script = $.script;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProtectionModeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProtectionModeArgs $;

        public Builder() {
            $ = new ProtectionModeArgs();
        }

        public Builder(ProtectionModeArgs defaults) {
            $ = new ProtectionModeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exe The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder exe(@Nullable Output<String> exe) {
            $.exe = exe;
            return this;
        }

        /**
         * @param exe The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder exe(String exe) {
            return exe(Output.of(exe));
        }

        /**
         * @param executable The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder executable(@Nullable Output<String> executable) {
            $.executable = executable;
            return this;
        }

        /**
         * @param executable The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder executable(String executable) {
            return executable(Output.of(executable));
        }

        /**
         * @param msi The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder msi(@Nullable Output<String> msi) {
            $.msi = msi;
            return this;
        }

        /**
         * @param msi The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder msi(String msi) {
            return msi(Output.of(msi));
        }

        /**
         * @param script The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script The application control policy enforcement/protection mode of the machine group
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        public ProtectionModeArgs build() {
            return $;
        }
    }

}
