package com.comphenix.protocol.events;

import com.comphenix.protocol.injector.GamePhase;

/**
 * Represents additional options a listener may require.
 *
 * @author Kristian
 */
public enum ListenerOptions {

    /**
     * Disable the automatic game phase detection that will normally force {@link GamePhase#LOGIN} when a packet ID is
     * known to be transmitted during login.
     */
    @Deprecated
    DISABLE_GAMEPHASE_DETECTION,

    /**
     * Do not verify that the owning plugin has a vaid plugin.yml.
     */
    SKIP_PLUGIN_VERIFIER,

    /**
     * Notify ProtocolLib that {@link PacketListener#onPacketSending(PacketEvent)} is thread safe.
     */
    ASYNC,

    /**
     * Notify ProtocolLib that {@link PacketListener#onPacketReceiving(PacketEvent)} must be executed on the main server
     * thread.
     */
    SYNC
}
